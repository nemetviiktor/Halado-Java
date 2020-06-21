package com.java.chat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.chat.DTO.AddMessageDTO;
import com.java.chat.Model.Message;
import com.java.chat.Model.User;
import com.java.chat.repo.MessageRepository;
import com.java.chat.repo.UsersRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UsersRepository userRepository;

	@Override
	public List<User> listUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public Optional<User> findById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public String removeUser(int id) {
		userRepository.deleteById(id);
		return id + "user removed";
	}
}
