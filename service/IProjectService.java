package com.bugtrackingsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;


@Service
public interface IProjectService {
	ProjectDTO createProject(ProjectDTO projDTO);
	ProjectDTO getProjectById(Integer projId);
	List<ProjectDTO> getAllProjects();
	ProjectDTO updateProject(ProjectDTO projDTO);
	List<DeveloperDTO> getDevelopersByProjectId(Integer projId);
	List<TestEngineerDTO> getTestEngineersByProjectId(Integer projId);
}
