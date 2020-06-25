package com.java.chat.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.chat.Controller.DTO.MessageDTO;
import com.java.chat.Model.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Integer>{
	
	public List<Message> findAll();
	
	public List<Message> findByToid(Integer toid);

}
