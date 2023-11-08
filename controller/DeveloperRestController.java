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
import com.bugtrackingsystem.serviceimplementation.IDeveloperServiceImplementation;

@RestController
@RequestMapping("/developers")
public class DeveloperRestController {
	 @Autowired
	 private IDeveloperServiceImplementation developerService;
	 @PostMapping("/add")
	    public String addDeveloper(@RequestBody DeveloperDTO developer) {
		 	return developerService.addDeveloper(developer);
	    }
	 @PutMapping("/update")
	    public String updateDeveloper(@RequestBody DeveloperDTO developer) {
	        return developerService.updateDeveloper(developer);
	    }
	 @GetMapping("/{devId}")
	    public DeveloperDTO getDeveloperById(@PathVariable Integer devId) {
	        return developerService.getDeveloperById(devId);
	    }

	    @GetMapping("/all")
	    public List<DeveloperDTO> getAllDevelopers() {
	        return developerService.getAllDevelopers();
	    }
	    @GetMapping("/{devId}/projects")
	    public List<ProjectDTO> getProjectByDevId(@PathVariable Integer devId) {
	        return developerService.getProjectByDevId(devId);
	    }

}
