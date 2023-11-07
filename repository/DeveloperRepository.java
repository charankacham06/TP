package com.bugtrackingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;
import com.bugtrackingsystem.entity.Developer;






@Repository
public interface DeveloperRepository extends JpaRepository<Developer,Integer>{
	DeveloperDTO addDeveloper(DeveloperDTO developer);
	DeveloperDTO updateDeveloper(DeveloperDTO developer);
	DeveloperDTO getDeveloperById(Integer devId);
	List<DeveloperDTO> getAllDevelopers();
	List<ProjectDTO> getProjectByDevId(Integer devId);
}
