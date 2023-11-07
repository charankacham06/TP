package com.bugtrackingsystem.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;
import com.bugtrackingsystem.repository.TestEngineerRepository;
import com.bugtrackingsystem.service.ITestEngineerService;
@Service
public class ITestEngineerServiceImplements implements ITestEngineerService {
	@Autowired
	private TestEngineerRepository terepository;
	@Override
	public String addTestEngineer(TestEngineerDTO testEngineer) {
		// TODO Auto-generated method stub
		terepository.addTestEngineer(testEngineer);
		return "Test Added successfully";
	}

	@Override
	public String updateTestEngineer(TestEngineerDTO testEngineer) {
		terepository.updateTestEngineer(testEngineer);
		return "TestEngineer Updated Successfully";
	}

	@Override
	public TestEngineerDTO getTestEngById(Integer testerId) {
		
		return terepository.getTestEngById(testerId);
	}

	@Override
	public List<TestEngineerDTO> getAllTesters() {
		
		return terepository.getAllTesters();
	}

	@Override
	public List<ProjectDTO> getProjectByTestEngId(Integer testEngId) {
		
		return terepository.getProjectByTestEngId(testEngId);
	}

}
