package com.java.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.chat.DTO.MessageDTO;
import com.java.chat.Model.Message;
import com.java.chat.repo.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public Message saveMessage(MessageDTO messageDTO) {
		return messageRepository.save(convertAddMessageDTOtoMessage(messageDTO));
	}

	@Override
	public List<Message> findByToid(Integer toid) {
		return messageRepository.findByToid(toid);
	}
	
	private Message convertAddMessageDTOtoMessage(MessageDTO messageDTO) {
		Message message = new Message();
		message.setToid(messageDTO.getToid());
		message.setText(messageDTO.getText());
		message.setDate(messageDTO.getDate());
		return message;
	}
	
}
