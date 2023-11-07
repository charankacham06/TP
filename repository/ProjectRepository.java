package com.bugtrackingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;
import com.bugtrackingsystem.entity.Project;




@Repository
public interface ProjectRepository extends JpaRepository<Project ,Integer>{
	ProjectDTO createProject(ProjectDTO projDTO);
	ProjectDTO getProjectById(Integer projId);
	List<ProjectDTO> getAllProjects();
	ProjectDTO updateProject(ProjectDTO projDTO);
	List<DeveloperDTO> getDevelopersByProjectId(Integer projId);
	List<TestEngineerDTO> getTestEngineersByProjectId(Integer projId);
}
