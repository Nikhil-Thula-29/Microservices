package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/billing-api")
@Slf4j
public class BillingOperationsServiceContoller {
	
	@Value("${server.port}")
	private Integer port;
	
	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("/billing")
	public ResponseEntity<String> showBillingInfo(){
		log.info("BillingMs::showBillinginfo method");
		return new ResponseEntity<String>("We accept UPI Payments,Debit Cards,Credit Cards,etc.. from the instance--> "+instanceId+"..."+port,HttpStatus.OK);
	}
}
