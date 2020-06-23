package com.java.chat.service;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.java.chat.Model.User;
import com.java.chat.repo.UsersRepository;


@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

	private static User user1;
	
	@Mock
	private UsersRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userService;
	
	@BeforeAll
	public static void init() {
		user1 = new User(1, "Nemet Viktor", "test");
	}
	
	@Test
	public void listUsersTest() {
		List<User> users = new ArrayList<>();
		users.add(user1);
		
		Mockito.when(userRepository.findAll()).thenReturn(users);
		userService.listUsers();
		Mockito.verify(userRepository, Mockito.times(1)).findAll();
	}
	
	@Test
	public void findByIdTest() {
		Mockito.when(userRepository.findById(1)).thenReturn(Optional.of(user1));
		assertThat(userService.findById(1), is(Optional.of(user1)));
		Mockito.verify(userRepository, Mockito.times(1)).findById(1);
	}
	
	@Test
	public void removeUserTest() {
		userService.removeUser(1);
		Mockito.verify(userRepository, Mockito.times(1)).deleteById(1);
	}
}
