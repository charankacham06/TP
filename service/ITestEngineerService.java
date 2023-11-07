package com.bugtrackingsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;


@Service
public interface ITestEngineerService {
	TestEngineerDTO addTestEngineer(TestEngineerDTO testEngineer);
	TestEngineerDTO updateTestEngineer(TestEngineerDTO testEngineer);
	TestEngineerDTO getTestEngById(Integer testerId);
	List<TestEngineerDTO> getAllTesters();
	List<ProjectDTO> getProjectByTestEngId(Integer testEngId);

}
