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

import com.java.chat.DAO.MessagesRepository;
import com.java.chat.DAO.UsersRepository;
import com.java.chat.Model.Messages;
import com.java.chat.Model.Users;
import com.java.chat.service.MessagesService;

@ExtendWith(MockitoExtension.class)
public class MessagesControllerTest {

	private static Users user1;
	private static Users user2;
	private static AddMessageDTO message4;
	private static Messages message1;
	private static Messages message2;
	
	@Mock
	private MessagesService messagesService;
	
	@InjectMocks
	private MessagesController messagesController;
	
	@MockBean
	private BindingResult bindingResult;
	
	@BeforeAll
	public static void init() {
		user1 = new Users(1, "aa", "test");
		user2 = new Users(2, "bb", "test2");
		message1 = new Messages(1, 2, 1, "test", "date");
		message2 = new Messages(2, 1, 2, "test2", "date2");
		message4 = new AddMessageDTO(1, "test4");
	}
	
	@Test
	public void addMessage() {
		messagesController.addMessage(message4, bindingResult);
		Mockito.verify(messagesService, Mockito.times(1)).saveMessage(message4);
	}

}
