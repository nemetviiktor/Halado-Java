package com.java.chat.service;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.chat.Controller.DTO.MessageDTO;
import com.java.chat.Model.Message;
import com.java.chat.repo.MessageRepository;


@ExtendWith(MockitoExtension.class)
class MessageServiceImplTest {

	private static Message message1;
	private static MessageDTO messageDTO;
	
	@Mock
	private MessageRepository messageRepository;
	
	@InjectMocks
	private MessageServiceImpl messageService;
	
	@BeforeAll
	public static void init() {
		message1 = new Message(1, 1, 1, "message", "2020.06.23");
		messageDTO = new MessageDTO(1, "message", "2020.06.23");
	}
	
	@Test
	public void saveMessageTest() {
		//given
		Mockito.when(messageRepository.save(message1)).thenReturn(message1);
		
		//when
		messageService.saveMessage(messageDTO);
		
		
		Mockito.verify(messageRepository, Mockito.times(1)).save(message1);
	}
	
	@Test
	public void findByToidTest() {
		List<Message> messages = new ArrayList<>();
		messages.add(message1);
		
		Mockito.when(messageRepository.findByToid(1)).thenReturn(messages);
		assertThat(messageService.findByToid(1), is(messages));
		Mockito.verify(messageRepository, Mockito.times(1)).findByToid(1);
	}
}
