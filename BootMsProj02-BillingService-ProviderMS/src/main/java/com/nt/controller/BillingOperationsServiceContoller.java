package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationsServiceContoller {

	@GetMapping("/billing")
	public ResponseEntity<String> showBillingInfo(){
		return new ResponseEntity<String>("We accept UPI Payments,Debit Cards,Credit Cards,etc..",HttpStatus.OK);
	}
}
