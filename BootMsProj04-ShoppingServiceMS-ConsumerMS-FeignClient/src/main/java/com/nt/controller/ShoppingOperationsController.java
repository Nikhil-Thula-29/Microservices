package com.nt.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IBillingServiceOperationsConsumerClient;

@RestController
@RequestMapping("/shopping-api")
public class ShoppingOperationsController {

	@Autowired
	private IBillingServiceOperationsConsumerClient clientComp;
	
	@GetMapping("/info")
	public ResponseEntity<String> shoppingInfo(){
		String billingInfo=clientComp.getPaymentOptions().getBody();
		String shoppingInfo="The shopping BillAmount is:: "+new Random().nextInt(2000);
		String finalResult=shoppingInfo+"....."+billingInfo;
		return new ResponseEntity<String>(finalResult,HttpStatus.OK);
	}
}
