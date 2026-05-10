package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.UserInformation;
import com.nt.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public String createUser(@RequestBody UserInformation userInformation) {
		return userService.createUser(userInformation);
	}
	
	@GetMapping("/{emailId}")
	public UserInformation getUserInfo(@PathVariable(name = "emailId") String emailId) {
		return userService.getUserInfo(emailId);
	}	
}
