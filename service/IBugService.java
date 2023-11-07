package com.bugtrackingsystem.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.BugDTO;
import com.bugtrackingsystem.entity.Bug;



@Service
public interface IBugService {
	BugDTO createBug(BugDTO bugDTO);
	BugDTO updateBug(BugDTO bugDTO);
	BugDTO findBugById(Integer bugId);
	List<BugDTO> findAllBugs();
	List<BugDTO> findAllBugsByProjectId(Integer projId);
	List<BugDTO> findBugsAssignedToDeveloper(Integer devId);
	List<BugDTO> findBugsAssignedToDeveloperByStatus(Integer devId, String status);
	List<BugDTO> findBugsByStatus(String status);
	List<BugDTO> findBugsBySeverity(String severity);
	List<BugDTO> findBugsByDate(LocalDate date);
	List<BugDTO> findBugsByDevIdAndDate(Integer devId, LocalDate startDate, LocalDate endDate);
	List<BugDTO> findBugsCreatedByTestEngineer(Integer testEngId);
	List<BugDTO> findBugsByProjectIdAndDevId(Integer projId,Integer devId);
	List<BugDTO> findBugsByProjectIdAndTestEngId(Integer projId,Integer testEngId);
}
