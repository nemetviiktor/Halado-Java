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

import com.java.chat.Model.Message;
import com.java.chat.Model.User;
import com.java.chat.repo.MessagesRepository;
import com.java.chat.repo.UsersRepository;
import com.java.chat.service.MessageService;

@ExtendWith(MockitoExtension.class)
public class MessagesControllerTest {

	private static User user1;
	private static User user2;
	private static AddMessageDTO message4;
	private static Message message1;
	private static Message message2;
	
	@Mock
	private MessageService messagesService;
	
	@Mock
	private MessagesRepository messagesRepository;
	
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
		message4 = new AddMessageDTO(1, "test4");
	}
	
	@Test
	public void addMessage() {
		messagesController.addMessage(message4, bindingResult);
		Mockito.verify(messagesService, Mockito.times(1)).saveMessage(message4);
	}

}
