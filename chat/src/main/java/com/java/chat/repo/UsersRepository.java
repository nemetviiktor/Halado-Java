package com.java.chat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.chat.Model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
	
	public List<User> findAll();

}
