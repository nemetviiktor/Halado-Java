package com.java.chat.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.java.chat.DTO.MessageDTO;
import com.java.chat.Model.Message;

public interface MessageService {
	
	public Message saveMessage(MessageDTO messageDTO);
	
	public List<Message> findByToid(Integer toid);
}
