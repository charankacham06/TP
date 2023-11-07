package com.bugtrackingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;
import com.bugtrackingsystem.entity.TestEngineer;




@Repository
public interface TestEngineerRepository extends JpaRepository<TestEngineer,Integer>{
	TestEngineerDTO addTestEngineer(TestEngineerDTO testEngineer);
	TestEngineerDTO updateTestEngineer(TestEngineerDTO testEngineer);
	TestEngineerDTO getTestEngById(Integer testerId);
	List<TestEngineerDTO> getAllTesters();
	List<ProjectDTO> getProjectByTestEngId(Integer testEngId);
}
