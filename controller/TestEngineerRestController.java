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
import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.dto.TestEngineerDTO;
import com.bugtrackingsystem.serviceimplementation.ITestEngineerServiceImplementation;

@RestController
@RequestMapping("/testers")
public class TestEngineerRestController {
	 @Autowired
	 private ITestEngineerServiceImplementation testEngineerService;
	 @PostMapping("/add")
	    public String addTestEngineer(@RequestBody TestEngineerDTO testEngineer) {
	        return testEngineerService.addTestEngineer(testEngineer);
	    }

	 @PutMapping("/update")
	    public String updateTestEngineer(@RequestBody TestEngineerDTO testEngineer) {
	        return testEngineerService.updateTestEngineer(testEngineer);
	    }
	 @GetMapping("/{testerId}")
	    public TestEngineerDTO getTestEngById(@PathVariable Integer testerId) {
	        return testEngineerService.getTestEngById(testerId);
	    }

	 @GetMapping("/all")
	    public List<TestEngineerDTO> getAllTesters() {
	        return testEngineerService.getAllTesters();
	    }
	 @GetMapping("/{testEngId}/projects")
	    public List<ProjectDTO> getProjectByTestEngId(@PathVariable Integer testEngId) {
	        return testEngineerService.getProjectByTestEngId(testEngId);
	    }


}
