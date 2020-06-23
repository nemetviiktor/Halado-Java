package com.java.chat.Controller;

import java.util.Optional;

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
import com.java.chat.service.MessageService;
import com.java.chat.service.UserService;

@ExtendWith(MockitoExtension.class)
public class MessageControllerTest {

	private static User user1;
	private static User user2;
	private static MessageDTO message4;
	private static Message message1;
	private static Message message2;
	
	@Mock
	private MessageService messageService;
	
	@Mock
	private UserService userService;
	
	@InjectMocks
	private MessageController messagesController;
	
	@MockBean
	private BindingResult bindingResult;
	
	@BeforeAll
	public static void init() {
		user1 = new User(1, "aa", "test");
		message1 = new Message(1, 2, 1, "test", "date");
		message4 = new MessageDTO(1, "Teszt", "2020.06.21.");
	}
	
	@Test
	public void addMessageTest() {
		messagesController.addMessage(message4, bindingResult);
		Mockito.verify(messageService, Mockito.times(1)).saveMessage(message4);
	}
	
	@Test
	public void deleteUserWhenFound() {
		Mockito.when(userService.findById(1)).thenReturn(Optional.of(user1));
		messagesController.delete(1);
		Mockito.verify(userService, Mockito.times(1)).removeUser(1);
	}
	
	@Test
	public void deleteUserWhenNotFound() {
		Mockito.when(userService.findById(1)).thenReturn(Optional.empty());
		messagesController.delete(1);
		Mockito.verify(userService, Mockito.times(0)).removeUser(1);
	}
}
