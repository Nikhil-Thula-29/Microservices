package com.nt.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingService_ConsumerClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/shopping-api")
@Slf4j
public class ShoppingOperationsController {

	@Autowired
	private BillingService_ConsumerClient clientComp;
	
	@GetMapping("/info")
	public ResponseEntity<String> shoppingInfo(){
		log.info("start of shoppingInfo()--ShoppingMS");
		String billingInfo=clientComp.getBillingInfo();
		log.info("Dest MS is invoked through client comp");
		String shoppingInfo="The shopping BillAmount is:: "+new Random().nextInt(2000);
		String finalResult=shoppingInfo+"....."+billingInfo;
		log.info("final result is prepared and send");
		return new ResponseEntity<String>(finalResult,HttpStatus.OK);
	}
}
