package com.action;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.ServiceTest;

@Controller
@RequestMapping("/test.do")
public class ActionTest {
	
	@Autowired
	private ServiceTest serviceTest;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(params="p=test")
	public String test()
	{
		String id = request.getParameter("id");
		System.out.println("来了action");
		serviceTest.findAdmin(Integer.parseInt(id));
		return "/jsp/index.jsp";
	}

}
