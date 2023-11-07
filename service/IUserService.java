package com.bugtrackingsystem.service;

import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.UserDTO;


@Service
public interface IUserService {
	UserDTO registerUser(UserDTO user);
	UserDTO signIn(String userName, String password);
	// use session management accordingly
	String signOut();
}
