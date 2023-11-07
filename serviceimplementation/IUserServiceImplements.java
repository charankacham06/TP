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
	public UserDTO registerUser(UserDTO user) {
		
		return null;
	}

	@Override
	public UserDTO signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String signOut() {
		// TODO Auto-generated method stub
		return null;
	}

}
