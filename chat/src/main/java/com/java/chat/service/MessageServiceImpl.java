package com.java.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.chat.Controller.AddMessageDTO;
import com.java.chat.Model.Message;
import com.java.chat.repo.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public Message saveMessage(Message message) {
		return messageRepository.save(message);
	}

	@Override
	public List<Message> findByToid(Integer toid) {
		return messageRepository.findByToid(toid);
	}
	
}
