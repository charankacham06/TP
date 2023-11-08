package com.bugtrackingsystem.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bugtrackingsystem.dto.BugDTO;
import com.bugtrackingsystem.serviceimplementation.IBugServiceImplementation;

@RestController
@RequestMapping("/bug")
public class BugRestController {
	@Autowired
	private IBugServiceImplementation bugService;
	 @PostMapping("/create")
	    public BugDTO createBug(@RequestBody BugDTO bugDTO) {
	        return bugService.createBug(bugDTO);
	    }
	 @PutMapping("/update")
	    public BugDTO updateBug(@RequestBody BugDTO bugDTO) {
	        return bugService.updateBug(bugDTO);
	    }
	 @GetMapping("/{bugId}")
	    public BugDTO findBugById(@PathVariable Integer bugId) {
	        return bugService.findBugById(bugId);
	    }
	 @GetMapping("/findallbugs")
	    public List<BugDTO> findAllBugs() {
	        return bugService.findAllBugs();
	    }
	 @GetMapping("/project/{projId}")
	    public List<BugDTO> findAllBugsByProjectId(@PathVariable Integer projId) {
	        return bugService.findAllBugsByProjectId(projId);
	    }
	 @GetMapping("/developer/{devId}")
	    public List<BugDTO> findBugsAssignedToDeveloper(@PathVariable Integer devId) {
	        return bugService.findBugsAssignedToDeveloper(devId);
	    }
	  @GetMapping("/developer/{devId}/{status}")
	    public List<BugDTO> findBugsAssignedToDeveloperByStatus(@PathVariable Integer devId, @PathVariable String status) {
	        return bugService.findBugsAssignedToDeveloperByStatus(devId, status);
	    }
	  @GetMapping("/status/{status}")
	    public List<BugDTO> findBugsByStatus(@PathVariable String status) {
	        return bugService.findBugsByStatus(status);
	    }
	  @GetMapping("/severity/{severity}")
	    public List<BugDTO> findBugsBySeverity(@PathVariable String severity) {
	        return bugService.findBugsBySeverity(severity);
	    }
	  @GetMapping("/date/{date}")
	    public List<BugDTO> findBugsByDate(@PathVariable LocalDate date) {
	        return bugService.findBugsByDate(date);
	    }
	  @GetMapping("/developer/{devId}/{startDate}/{endDate}")
	    public List<BugDTO> findBugsByDevIdAndDate(@PathVariable Integer devId, @PathVariable LocalDate startDate, @PathVariable LocalDate endDate) {
	        return bugService.findBugsByDevIdAndDate(devId, startDate, endDate);
	    }
	  @GetMapping("/testEngineer/{testEngId}")
	    public List<BugDTO> findBugsCreatedByTestEngineer(@PathVariable Integer testEngId) {
	        return bugService.findBugsCreatedByTestEngineer(testEngId);
	    }
	  @GetMapping("/project/{projId}/developer/{devId}")
	    public List<BugDTO> findBugsByProjectIdAndDevId(@PathVariable Integer projId, @PathVariable Integer devId) {
	        return bugService.findBugsByProjectIdAndDevId(projId, devId);
	    }
	  @GetMapping("/project/{projId}/testEngineer/{testEngId}")
	    public List<BugDTO> findBugsByProjectIdAndTestEngId(@PathVariable Integer projId, @PathVariable Integer testEngId) {
	        return bugService.findBugsByProjectIdAndTestEngId(projId, testEngId);
	    }
}

