package com.java.chat.Controller;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.chat.DTO.MessageDTO;
import com.java.chat.Model.Message;
import com.java.chat.Model.User;
import com.java.chat.repo.MessageRepository;
import com.java.chat.repo.UsersRepository;
import com.java.chat.service.MessageService;
import com.java.chat.service.MessageServiceImpl;
import com.java.chat.service.UserService;

@Controller
public class MessagesController {
	
	@Autowired
	private MessageService messageService;
	
	@Autowired
	private UserService userService;
	
	
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
	public ModelAndView addMessage(@Valid @ModelAttribute("addmessagedto") MessageDTO messageDTO, BindingResult bindingResult){

		if (!bindingResult.hasErrors()) {
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
        userService.removeUser(id);
        return new ModelAndView("redirect:/");
    }
	
	
	@RequestMapping(value="/showSelected",method=RequestMethod.GET)
	public String getAllMessagesFindByToid(@RequestParam int toid, Model model){
			model.addAttribute("messages", messageService.findByToid(toid));
			return "showSelected";	
	}
	
}
