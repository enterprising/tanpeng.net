package com.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ArticleDAO;
import com.dao.HQLDAO;
import com.pojo.Article;

@Service
public class ArticleService {

	@Autowired
	private ArticleDAO articleDAO;

	@Autowired
	private HQLDAO hqldao;

	/**
	 * 读取出首页显示的那篇博客
	 * 
	 * @return
	 */
	public Article getM() {
		Article article = new Article();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String date2 = sdf.format(date).toString();
		String hql = "from Article where articleId like '%" + date2 + "%'";
		int id = 1610290001;
		List<Article> list = hqldao.findByHQL(hql);
		if(list.size()<=0)
			article = articleDAO.findById(id);
		else
			article = list.get(0);
		return article;
	}

	/**
	 * 读出首页显示的 相关阅读
	 * 
	 * @param id
	 * @return
	 */
	public List<Article> getXiangguan(int id) {
		id = 8;
		List<Article> list = new ArrayList<Article>();
		String hql = "from Article as article where article.category.categoryId = ?";
		list = hqldao.findByHQL(hql, id);
		/*for (Article article : list) {
			System.out.println("article:" + article.getArticleContent());
		}*/
		if (list.size() <= 0) {
			hql = "from Article as article where article.category.categoryId = 8";
			list = hqldao.findByHQL(hql, id);
		}
		return list;
	}

}
