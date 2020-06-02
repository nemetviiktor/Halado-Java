package com.java.chat.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.chat.Model.Messages;

@Repository
public interface MessagesRepository extends JpaRepository<Messages, Integer> {
	
	List<Messages> findAll();
	
	
	
	List<Messages> findByToid(Integer toid);
	

}
