package com.bugtrackingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtrackingsystem.dto.UserDTO;
import com.bugtrackingsystem.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	UserDTO registerUser(UserDTO user);
	UserDTO signIn(String userName, String password);
	// use session management accordingly
	String signOut();
}
