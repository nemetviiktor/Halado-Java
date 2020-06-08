package com.java.chat.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	// html, Bindig result (error), tests
	
	
	@Autowired
	UsersRepository usersRepository;
	
	@Autowired
	MessagesRepository messagesRepository;
	
	
	@RequestMapping("/")
	public String Index() {
		
		return "index";
	}
	
	@GetMapping(value = "/send")
	public ModelAndView getRoot() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("messages");
		mav.addObject("users", usersRepository.findAll());
		return mav;
	}
	
	@RequestMapping(value="/selectedUser" )	// BindingResult bindingResult
	public ModelAndView getUsers(@RequestParam int id){
		ModelAndView mv = new ModelAndView("selectedUser");
		Users users = usersRepository.findById(id).orElse(new Users());
		mv.addObject(users);
		
		return mv;
	}
	
	@RequestMapping("/addMessage")
	public ModelAndView addMessage(Messages messages){
		
		messagesRepository.save(messages);
		
		return new ModelAndView("redirect:/");
	}
	
	
	@RequestMapping(value="/showUsers",method=RequestMethod.GET)
	public String getAllUser(Model model){
		model.addAttribute("users", usersRepository.findAll());
		return "listUsers.jsp";				
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        usersRepository.deleteById(id);
        return new ModelAndView("redirect:/");
    }
	
	@RequestMapping(value="/showSelected",method=RequestMethod.GET)
	public String getAllMessagesFindByToid(@RequestParam int toid, Model model){
			model.addAttribute("messages",messagesRepository.findByToid(toid));
			return "showSelected.jsp";	
		}

}
