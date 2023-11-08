package com.bugtrackingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;
import com.bugtrackingsystem.serviceimplementation.IProjectServiceImplementation;

@RestController
@RequestMapping("/projects")
public class ProjectRestController {
	 @Autowired
	    private IProjectServiceImplementation projectService;
	 @PostMapping("/create")
	    public ProjectDTO createProject(@RequestBody ProjectDTO projDTO) {
	        return projectService.createProject(projDTO);
	    }

	    @GetMapping("/{projId}")
	    public ProjectDTO getProjectById(@PathVariable Integer projId) {
	        return projectService.getProjectById(projId);
	    }
	    @GetMapping("/all")
	    public List<ProjectDTO> getAllProjects() {
	        return projectService.getAllProjects();
	    }

	    @PutMapping("/update")
	    public ProjectDTO updateProject(@RequestBody ProjectDTO projDTO) {
	        return projectService.updateProject(projDTO);
	    }
	    @GetMapping("/{projId}/developers")
	    public List<DeveloperDTO> getDevelopersByProjectId(@PathVariable Integer projId) {
	        return projectService.getDevelopersByProjectId(projId);
	    }

	    @GetMapping("/{projId}/testEngineers")
	    public List<TestEngineerDTO> getTestEngineersByProjectId(@PathVariable Integer projId) {
	        return projectService.getTestEngineersByProjectId(projId);
	    }
}
