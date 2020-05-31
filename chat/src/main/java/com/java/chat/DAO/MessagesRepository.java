package com.java.chat.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.chat.Model.Messages;

public interface MessagesRepository extends JpaRepository<Messages, Integer> {
	
	List<Messages> findAll();
	
	@Query(value = "SELECT * FROM Messages m WHERE m.toid = ?1", 
			  nativeQuery = true)
	List<Messages> findByToid(Integer toid);
	

}
