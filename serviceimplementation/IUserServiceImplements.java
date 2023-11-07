package com.bugtrackingsystem.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.UserDTO;
import com.bugtrackingsystem.repository.UserRepository;
import com.bugtrackingsystem.service.IUserService;
@Service
public class IUserServiceImplements implements IUserService{
	@Autowired
	private UserRepository userrepository;
	@Override
	public String registerUser(UserDTO user) {
		userrepository.registerUser(user);
		return "User Registered Succesfully";
	}

	@Override
	public String signIn(String userName, String password) {
		userrepository.signIn(userName, password);
		return "User Signed In";
	}

	@Override
	public String signOut() {
		userrepository.signOut();
		return "User Signed Out";
	}

}
