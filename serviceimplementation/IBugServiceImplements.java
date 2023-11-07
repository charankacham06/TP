package com.bugtrackingsystem.serviceimplementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.BugDTO;
import com.bugtrackingsystem.repository.BugRepository;
import com.bugtrackingsystem.service.IBugService;
@Service
public class IBugServiceImplements implements IBugService{
	@Autowired
	private BugRepository bugrepository;
	@Override
	public BugDTO createBug(BugDTO bugDTO) {
		
		return null;
	}

	@Override
	public BugDTO updateBug(BugDTO bugDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BugDTO findBugById(Integer bugId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findAllBugs() {
		
		return null;
	}

	@Override
	public List<BugDTO> findAllBugsByProjectId(Integer projId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsAssignedToDeveloper(Integer devId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsAssignedToDeveloperByStatus(Integer devId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsBySeverity(String severity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsByDevIdAndDate(Integer devId, LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsCreatedByTestEngineer(Integer testEngId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsByProjectIdAndDevId(Integer projId, Integer devId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BugDTO> findBugsByProjectIdAndTestEngId(Integer projId, Integer testEngId) {
		// TODO Auto-generated method stub
		return null;
	}

}