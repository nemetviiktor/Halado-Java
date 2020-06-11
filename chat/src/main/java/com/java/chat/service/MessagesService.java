package com.java.chat.service;

import org.springframework.stereotype.Service;

import com.java.chat.Controller.AddMessageDTO;
import com.java.chat.Model.Messages;

@Service
public interface MessagesService {
	
	Messages saveMessage(AddMessageDTO addmessagedto);

}
