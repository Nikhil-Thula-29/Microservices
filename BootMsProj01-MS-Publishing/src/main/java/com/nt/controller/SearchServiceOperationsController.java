package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search-api")
public class SearchServiceOperationsController {

	@GetMapping("/search")
	public ResponseEntity<String> searchServiceWelcome(){
		return new ResponseEntity<String>("Welcome to Search Service to flipkart.com",HttpStatus.OK);
	}
}
