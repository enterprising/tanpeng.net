package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;









import com.pojo.Article;
import com.pojo.Category;
import com.pojo.Link;
import com.service.ArticleService;
import com.service.CategoryService;
import com.service.LinksService;

@Controller
@RequestMapping("/main.do")
public class MainAction {

	@Autowired
	private LinksService linksService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(params="p=getall")
	public String getall(){
		List<Link> linkList = new ArrayList<Link>();
		linkList = linksService.getall();
		List<Category> categoryList = new ArrayList<Category>();
		categoryList = categoryService.getall();
		Article articleM = articleService.getM();
		int id=-1;
		List<Article> articleXiangguanList = articleService.getXiangguan(id);
		articleXiangguanList = articleXiangguanList.subList(1, 4);
		request.getSession().setAttribute("linkList", linkList);
		request.getSession().setAttribute("categoryList", categoryList);
		request.getSession().setAttribute("articleM", articleM);
		request.getSession().setAttribute("articleXiangguanList", articleXiangguanList);
		return "/jsp/index.jsp";
	}
}
