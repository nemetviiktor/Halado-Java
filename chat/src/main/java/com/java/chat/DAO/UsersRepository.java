package com.java.chat.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.chat.Model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	List<Users> findAll();

}
