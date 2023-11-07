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
	public TestEngineerDTO addTestEngineer(TestEngineerDTO testEngineer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestEngineerDTO updateTestEngineer(TestEngineerDTO testEngineer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestEngineerDTO getTestEngById(Integer testerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestEngineerDTO> getAllTesters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectDTO> getProjectByTestEngId(Integer testEngId) {
		// TODO Auto-generated method stub
		return null;
	}

}
