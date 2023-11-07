package com.bugtrackingsystem.dto;

import java.util.List;

import lombok.Data;

@Data
public class TestEngineerDTO extends UserDTO{
	
	private String testerName;
	
	private String testerSkill;

	private List<ProjectDTO> project;
}

