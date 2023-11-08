package com.bugtrackingsystem.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;
import com.bugtrackingsystem.repository.ProjectRepository;
import com.bugtrackingsystem.service.IProjectService;

@Service
public class IProjectServiceImplementation implements IProjectService {
	@Autowired
	private ProjectRepository projectrepository;
	@Override
	public ProjectDTO createProject(ProjectDTO projDTO) {
		 
		return projectrepository.createProject(projDTO);
	}

	@Override
	public ProjectDTO getProjectById(Integer projId) {
		
		return projectrepository.getProjectById(projId);
	}

	@Override
	public List<ProjectDTO> getAllProjects() {
	
		return projectrepository.getAllProjects();
	}

	@Override
	public ProjectDTO updateProject(ProjectDTO projDTO) {
		
		return projectrepository.updateProject(projDTO);
	}

	@Override
	public List<DeveloperDTO> getDevelopersByProjectId(Integer projId) {
	
		return projectrepository.getDevelopersByProjectId(projId);
	}

	@Override
	public List<TestEngineerDTO> getTestEngineersByProjectId(Integer projId) {
		
		return projectrepository.getTestEngineersByProjectId(projId);
	}

}
