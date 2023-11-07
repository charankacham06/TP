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
public class IProjectServiceImplements implements IProjectService {
	@Autowired
	private ProjectRepository projectrepository;
	@Override
	public ProjectDTO createProject(ProjectDTO projDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectDTO getProjectById(Integer projId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectDTO> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectDTO updateProject(ProjectDTO projDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeveloperDTO> getDevelopersByProjectId(Integer projId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestEngineerDTO> getTestEngineersByProjectId(Integer projId) {
		// TODO Auto-generated method stub
		return null;
	}

}
