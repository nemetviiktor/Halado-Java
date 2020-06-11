package com.java.chat.service;

import org.springframework.stereotype.Service;

import com.java.chat.Controller.AddMessageDTO;
import com.java.chat.DAO.MessagesRepository;
import com.java.chat.Model.Messages;

@Service
public class MessagesServiceImpl implements MessagesService {
	
	private MessagesRepository messagesRepository;

	@Override
	public Messages saveMessage(AddMessageDTO addmessagedto) {
		return messagesRepository.save(convertAddMessagesDTOtoMessages(addmessagedto));
	}

	private Messages convertAddMessagesDTOtoMessages(AddMessageDTO addmessagedto) {
		Messages message = new Messages();
		message.setText(addmessagedto.getText());
		message.setToid(addmessagedto.getToid());
		return message;
	}
	
}
