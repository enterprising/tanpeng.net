package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CategoryDAO;
import com.pojo.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@SuppressWarnings("unchecked")
	public List<Category> getall()
	{
		List<Category> list = new ArrayList<Category>();
		list = categoryDAO.findAll();
		return list;
	}
	
}
