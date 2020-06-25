package com.java.chat.Controller;


import java.util.Date;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.chat.Controller.DTO.MessageDTO;
import com.java.chat.Model.User;
import com.java.chat.service.MessageService;
import com.java.chat.service.UserService;

@Controller
public class MessageController {
	
	private MessageService messageService;
	private UserService userService;
	
	
	@Autowired
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	
	@RequestMapping("/")
	public String Index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/send")
	public ModelAndView getUsers() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("sendmessage");
		mav.addObject("user", userService.listUsers());
		mav.addObject("messageDTO", new MessageDTO());
		return mav;
	}
	
	@PostMapping("/addmessage")
	public ModelAndView addMessage(@Valid @ModelAttribute("messageDTO") MessageDTO messageDTO, BindingResult bindingResult){
		
		if (!bindingResult.hasErrors()) {
			String date = new Date().toString();
			messageDTO.setDate(date);
			messageService.saveMessage(messageDTO);
			return new ModelAndView("redirect:/");
		}
		
		User user = userService.findById(messageDTO.getToid()).orElse(new User());
		return new ModelAndView("sendmessage").addObject(user).addObject("messageDTO", messageDTO);
	}
	
	@RequestMapping(value="/showUsers",method=RequestMethod.GET)
	public String getAllUser(Model model){
		model.addAttribute("users", userService.listUsers());
		return "listUsers";				
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam("id") int id) {
		Optional<User> user = userService.findById(id);
		if (!user.isPresent()) {
			return new ModelAndView("error");
		}
        userService.removeUser(id);
        return new ModelAndView("redirect:/");
    }
	
	@RequestMapping(value="/showSelected",method=RequestMethod.GET)
	public String getAllMessagesFindByToid(@RequestParam int toid, Model model){
			model.addAttribute("messages", messageService.findByToid(toid));
			return "showSelected";	
	}
	
}
