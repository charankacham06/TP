package com.bugtrackingsystem.dto;

import java.util.List;

import lombok.Data;

@Data

public class DeveloperDTO extends UserDTO{
	
	
	private String devName;
	
	private String devSkill;
	
	private List<ProjectDTO> project;
}
