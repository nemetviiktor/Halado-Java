package com.java.chat.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.chat.Model.Messages;

public interface MessagesRepository extends JpaRepository<Messages, Integer> {
	
	List<Messages> findAll();

}
