package com.bugtrackingsystem.dto;

import lombok.Data;

@Data
public class UserDTO {
	
	
	private Integer userId;

	private String userName;
	
	private String userPassword;
	
	private String userEmail;
	
	private String userContact;
	// Admin, Developer, TestEngineer
	
	private String userRole;
}
