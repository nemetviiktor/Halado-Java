package com.java.chat.Controller;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.validation.BindingResult;

import com.java.chat.DTO.MessageDTO;
import com.java.chat.Model.Message;
import com.java.chat.Model.User;
import com.java.chat.repo.MessageRepository;
import com.java.chat.service.MessageService;

@ExtendWith(MockitoExtension.class)
public class MessagesControllerTest {

	private static User user1;
	private static User user2;
	private static MessageDTO message4;
	private static Message message1;
	private static Message message2;
	
	@Mock
	private MessageService messageService;
	
	@Mock
	private MessageRepository messageRepository;
	
	@InjectMocks
	private MessagesController messagesController;
	
	@MockBean
	private BindingResult bindingResult;
	
	@BeforeAll
	public static void init() {
		user1 = new User(1, "aa", "test");
		user2 = new User(2, "bb", "test2");
		message1 = new Message(1, 2, 1, "test", "date");
		message2 = new Message(2, 1, 2, "test2", "date2");
		message4 = new MessageDTO(1, "test4");
	}
	
	@Test
	public void addMessage() {
		messagesController.addMessage(message1, bindingResult);
		Mockito.verify(messageService, Mockito.times(1)).saveMessage(message1);
	}

}
