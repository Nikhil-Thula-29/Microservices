package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.UserInformation;
import com.nt.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public String createUser(UserInformation userInformation) {
		 userRepo.save(userInformation);
		 return "User Created successfully";
	}

	
	public UserInformation getUserInfo(String emailId) {

	    return userRepo.findById(emailId)
	            .orElseThrow(() ->
	                new RuntimeException("User not found"));
	}
	
	
}
