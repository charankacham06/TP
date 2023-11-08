package com.bugtrackingsystem.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.repository.DeveloperRepository;
import com.bugtrackingsystem.service.IDeveloperService;
@Service
public class IDeveloperServiceImplementation implements IDeveloperService{
	@Autowired
	private DeveloperRepository devrepository;
	@Override
	public String addDeveloper(DeveloperDTO developer) {
		devrepository.addDeveloper(developer);
		return "Developer Added Succesfully";
	}

	@Override
	public String updateDeveloper(DeveloperDTO developer) {
		devrepository.updateDeveloper(developer);
		return "Developer Updated Succesfully";
	}

	@Override
	public DeveloperDTO getDeveloperById(Integer devId) {
		
		return devrepository.getDeveloperById(devId);
	}

	@Override
	public List<DeveloperDTO> getAllDevelopers() {
		
		return devrepository.getAllDevelopers();
	}

	@Override
	public List<ProjectDTO> getProjectByDevId(Integer devId) {
		
	 return devrepository.getProjectByDevId(devId);
	}

}
