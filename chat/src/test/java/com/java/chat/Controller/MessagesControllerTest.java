package com.java.chat.Controller;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.validation.BindingResult;

import com.java.chat.DAO.MessagesRepository;
import com.java.chat.DAO.UsersRepository;
import com.java.chat.Model.Messages;
import com.java.chat.Model.Users;

@ExtendWith(MockitoExtension.class)
public class MessagesControllerTest {

	private static Users user1;
	private static Users user2;
	private static MessagesRepository message4;
	private static UsersRepository user4;
	private static AddMessageDTO message1;
	private static AddMessageDTO message2;
	
	@Mock
	private MessagesRepository messagesRepository;
	
	@Mock
	private AddMessageDTO addmessagedto;
	
	@Mock
	private UsersRepository usersRepository;
	
	@InjectMocks
	private MessagesController messagesController;
	
	@Test
	public void addMessage() {
		BindingResult bindingResult = null;
		messagesController.addMessage(message1, bindingResult);
		Mockito.verify(addmessagedto, Mockito.times(1)).save(message1);
	}

}
