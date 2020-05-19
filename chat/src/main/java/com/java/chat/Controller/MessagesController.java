package com.java.chat.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.chat.DAO.MessagesRepository;
import com.java.chat.DAO.UsersRepository;
import com.java.chat.Model.Messages;
import com.java.chat.Model.Users;

@Controller
public class MessagesController {
	
	@Autowired
	UsersRepository usersRepository;
	
	@Autowired
	MessagesRepository messagesRepository;
	
	/*
	@RequestMapping("/")
	public String Index() {
		
		return "index.jsp";
	}
	*/
	
	public List<Users> getUsers() {
		List<Users> users = usersRepository.findAll();
		
		return users;
		
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getAllUsers(Model model) {
		model.addAttribute("users",getUsers());
		return "messages.jsp";
	}
	
	@RequestMapping(value="/selectedUser", method=RequestMethod.GET )	// BindingResult bindingResult
	public ModelAndView getMenu(@RequestParam int id){
		ModelAndView mv = new ModelAndView("selectedUser.jsp");
		Users users = usersRepository.findById(id).orElse(new Users());
		mv.addObject(users);
		
		return mv;
	}
	
	@RequestMapping("/addMessage")
	public String addOrder(Messages messages){
		
		messagesRepository.save(messages);
		
		return "index.jsp";							// return new ModelAndView("redirect:/");
	}
	
	
}
