package com.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.LunbotuService;
import com.util.StringUtil;

@Controller
@RequestMapping("/lunbotu.do")
public class LunbotuAction {
	@Autowired
	private LunbotuService lunbotuService;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(params= "p=piliangUse")
	public String piliangUse(){
		String ids = request.getParameter("ids");
		lunbotuService.piliangUse(ids);
		return fenye();
	}
	
	@RequestMapping(params= "p=fenye")
	public String fenye(){
		int page = 1;
		int size = 3;
		String pageString = request.getParameter("page");
		String sizeString = request.getParameter("size");
		if (StringUtil.isNotNull(pageString))
			page = Integer.parseInt(pageString);

		if (StringUtil.isNotNull(sizeString))
			size = Integer.parseInt(sizeString);
		
		String datemin = request.getParameter("datemin");
		String datemax = request.getParameter("datemax");
		String name = request.getParameter("name");
		Map map = lunbotuService.fenye(datemin, datemax, name, page, size);
		request.setAttribute("map", map);
		
		//转发
		return "/index.jsp";  //重定向 return "/redirect:index.jsp
	}

	@RequestMapping(params="p=changeStatu")
	public String changeStatu(){
		System.out.println("action");
		String id = request.getParameter("id");
		int status =lunbotuService.chageStatus(id);
		System.out.println(status);
		return status+"";
	}
}
