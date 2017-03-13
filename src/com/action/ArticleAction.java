package com.action;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.ArticleService;

@Controller
@RequestMapping("/article.do")
public class ArticleAction {
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ArticleService articleService;
	

}
