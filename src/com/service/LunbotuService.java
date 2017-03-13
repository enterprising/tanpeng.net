package com.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.dao.HQLDAO;
import com.dao.LunbotuDAO;
import com.pojo.Lunbotu;
import com.util.StringUtil;

@Service
public class LunbotuService {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"app*.xml");
		LunbotuService empTestService = (LunbotuService) applicationContext
				.getBean("lunbotuService");
		Map map = empTestService.fenye(null, null, "һ", 1, 4);
		System.out.println(map);

	}

	@Autowired
	private LunbotuDAO lunbotuDAO;

	@Autowired
	private HQLDAO hqldao;

	public void piliangUse(String ids) {
		String hql = "update Lunbotu set LStatu=1 where LId in (" + ids + ")";
		hqldao.bulkUpdate(hql);
	}

	public Map fenye(String datemin, String datemax, String name, int page,
			int size) {
		StringBuffer sqlWhere = new StringBuffer(" where 1=1 ");
		List paramlist = new ArrayList();
		if (StringUtil.isNotNull(datemin)) {
			Timestamp sqldatemin = Timestamp.valueOf(datemin + " 00:00:00");
			sqlWhere.append("and LTime > ?");
			paramlist.add(sqldatemin);
		}
		if (StringUtil.isNotNull(datemax)) {
			Timestamp sqldatemax = Timestamp.valueOf(datemax + " 23:59:59");
			sqlWhere.append(" and LTime < ?");
			paramlist.add(sqldatemax);
		}
		if (StringUtil.isNotNull(name)) {
			sqlWhere.append(" and LName like ?");
			paramlist.add("%" + name + "%");
		}

		String sumHQL = "select count(*) from Lunbotu " + sqlWhere.toString();
		int sum = (int) hqldao.unique(sumHQL, paramlist.toArray());

		if (sum == 0)
			return null;

		int sumPage = sum % size == 0 ? sum / size : sum / size + 1;

		if (sumPage < 1)
			sumPage = 1;
		if (page > sumPage)
			page = sumPage;

		String hql = "from Lunbotu " + sqlWhere.toString();
		List list = hqldao.pageQuery(hql, page, size, paramlist.toArray());

		Map map = new HashMap();
		map.put("list", list);
		map.put("size", size);
		map.put("count", sumPage);
		map.put("sum", sum);
		map.put("page", page);
		return map;
	}

	public int chageStatus(String id) {
		Lunbotu lunbotu = new Lunbotu();
		int id_ = Integer.parseInt(id);
		lunbotu = lunbotuDAO.findById(id_);
		int newStatus = 0;
		int oldStatus = lunbotu.getLStatu();
		if (oldStatus == 1)
			newStatus = 0;
		if (oldStatus == 0)
			newStatus = 1;
		lunbotu.setLStatu(newStatus);
		return newStatus;
	}

}
