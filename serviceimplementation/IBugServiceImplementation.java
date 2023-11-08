package com.bugtrackingsystem.serviceimplementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.BugDTO;
import com.bugtrackingsystem.repository.BugRepository;
import com.bugtrackingsystem.service.IBugService;
@Service
public class IBugServiceImplementation implements IBugService{
	@Autowired
	private BugRepository bugrepository;
	@Override
	public BugDTO createBug(BugDTO bugDTO) {
		BugDTO createBug = bugrepository.createBug(bugDTO);
		return createBug;
	}

	@Override
	public BugDTO updateBug(BugDTO bugDTO) {
		   Integer bugId = bugDTO.getBugId();
		    BugDTO existingBug = bugrepository.findBugById(bugId);

		    if (existingBug == null) {
		return null;
	}
		    existingBug.setBugTitle(bugDTO.getBugTitle());
		    existingBug.setBugDescription(bugDTO.getBugDescription());
		    existingBug.setSeverity(bugDTO.getSeverity());
		    existingBug.setAssignTo(bugDTO.getAssignTo());
		    existingBug.setStatus(bugDTO.getStatus());
		    existingBug.setStartDate(bugDTO.getStartDate());
		    existingBug.setLastUpdatedDate(bugDTO.getLastUpdatedDate());
		    existingBug.setProject(bugDTO.getProject());

		    // Save the updated bug to the repository.
		    BugDTO updatedBug = bugrepository.updateBug(existingBug);

		    return updatedBug;
	}
	@Override
	public BugDTO findBugById(Integer bugId) {
		// TODO Auto-generated method stub
		return bugrepository.findBugById(bugId);
	}

	@Override
	public List<BugDTO> findAllBugs() {
		
		return  bugrepository.findAllBugs();
	}

	@Override
	public List<BugDTO> findAllBugsByProjectId(Integer projId) {
		// TODO Auto-generated method stub
		return bugrepository.findAllBugsByProjectId(projId);
	}

	@Override
	public List<BugDTO> findBugsAssignedToDeveloper(Integer devId) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsAssignedToDeveloper(devId);
	}

	@Override
	public List<BugDTO> findBugsAssignedToDeveloperByStatus(Integer devId, String status) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsAssignedToDeveloperByStatus(devId, status);
	}

	@Override
	public List<BugDTO> findBugsByStatus(String status) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsByStatus(status);
	}

	@Override
	public List<BugDTO> findBugsBySeverity(String severity) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsBySeverity(severity);
	}

	@Override
	public List<BugDTO> findBugsByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsByDate(date);
	}

	@Override
	public List<BugDTO> findBugsByDevIdAndDate(Integer devId, LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsByDevIdAndDate(devId, startDate, endDate);
	}

	@Override
	public List<BugDTO> findBugsCreatedByTestEngineer(Integer testEngId) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsCreatedByTestEngineer(testEngId);
	}

	@Override
	public List<BugDTO> findBugsByProjectIdAndDevId(Integer projId, Integer devId) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsByProjectIdAndDevId(projId, devId);
	}

	@Override
	public List<BugDTO> findBugsByProjectIdAndTestEngId(Integer projId, Integer testEngId) {
		// TODO Auto-generated method stub
		return bugrepository.findBugsByProjectIdAndTestEngId(projId, testEngId);
	}

}
