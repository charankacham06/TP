package com.bugtrackingsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;

@Service
public interface IDeveloperService {
	String addDeveloper(DeveloperDTO developer);
	String updateDeveloper(DeveloperDTO developer);
	DeveloperDTO getDeveloperById(Integer devId);
	List<DeveloperDTO> getAllDevelopers();
	List<ProjectDTO> getProjectByDevId(Integer devId);
}

