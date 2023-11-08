package com.bugtrackingsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bugtrackingsystem.dto.UserDTO;
import com.bugtrackingsystem.serviceimplementation.IUserServiceImplementation;

@RestController
@RequestMapping("/users")
public class UserRestController {
	@Autowired
    private IUserServiceImplementation userService;
	
	 @PostMapping("/register")
	    public String registerUser(@RequestBody UserDTO user) {
	        return userService.registerUser(user);
	    }
	 @PostMapping("/signin")
	    public String signIn(@RequestParam String userName, @RequestParam String password) {
	        return userService.signIn(userName, password);
	    }
	 @PostMapping("/signout")
	    public String signOut() {
	        return userService.signOut();
	    }
}
