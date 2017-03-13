package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MessageDAO;
import com.pojo.Message;

@Service
public class MessageService {

	@Autowired
	private MessageDAO messageDAO;
	
	public boolean add(Message message){
		messageDAO.save(message);
		Message message2 = messageDAO.findById(message.getMessageId());
		if(message2!=null)
			return true;
		else
			return false;
	}
}
