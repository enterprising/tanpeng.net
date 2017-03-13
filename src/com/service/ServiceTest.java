package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDAO;
import com.pojo.Admin;

@Service
public class ServiceTest {
	
	@Autowired
	private AdminDAO adminDAO;
	
	public void findAdmin(int id){
		System.out.println("来了service");
		System.out.println("id="+id);
		Admin admin = new Admin();
		admin = adminDAO.findById(id);
		System.out.println(admin.getAdminName());
	}
}
