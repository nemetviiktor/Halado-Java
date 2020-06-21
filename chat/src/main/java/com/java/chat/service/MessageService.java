package com.java.chat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.chat.Controller.AddMessageDTO;
import com.java.chat.Model.Message;

public interface MessageService {
	
	public Message saveMessage(Message message);
	
	public List<Message> findByToid(Integer toid);
}
