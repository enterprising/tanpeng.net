package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LinkDAO;
import com.pojo.Link;

@Service
public class LinksService {
	
	@Autowired
	private LinkDAO linkDAO;
	
	public List<Link> getall(){
		List<Link> list = new ArrayList<Link>();
		list = linkDAO.findAll();
		return list;
	}

}
