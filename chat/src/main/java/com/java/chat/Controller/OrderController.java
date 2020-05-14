package com.java.chat.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.chat.DAO.MessagesRepository;
import com.java.chat.DAO.UsersRepository;

@Controller
public class OrderController {
	
	@Autowired
	UsersRepository usersRepository;
	
	@Autowired
	MessagesRepository messagesRepository;
	
	@RequestMapping("/")
	public String Index() {
		
		return "index.jsp";
	}
	
	
	
}
