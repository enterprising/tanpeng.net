package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Link;
import com.service.LinksService;

@Controller
@RequestMapping("/link.do")
public class LinksAction {

	@Autowired
	private LinksService linksService;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(params = "p=getall")
	public String getall() {
		List<Link> list = new ArrayList<Link>();
		list = linksService.getall();
		for (Link link : list) {
			System.out.println(link.getLinkName());
			System.out.println(link.getLinkHref());
		}
		request.getSession().setAttribute("linkList", list);
		return "index.jsp";
	}

}
