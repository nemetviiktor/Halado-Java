package com.java.chat.service;

import java.util.List;
import java.util.Optional;

import com.java.chat.Model.User;

public interface UserService {

	public List<User> listUsers();
	
	public Optional<User> findById(int id);
	
	public String removeUser(int id);
}
