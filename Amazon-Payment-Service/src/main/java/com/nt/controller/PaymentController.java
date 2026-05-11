package com.nt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.NetBankingInfo;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
	
	@GetMapping("/options")
	public List<String> getAllPaymentOptions(){
		log.info("payment for payment options: ");
		return List.of("UPI","Net Banking","Credit Card","Debit Card");
	}
	
	@PostMapping("/netbanking")
	public String netbanking(@RequestBody NetBankingInfo netBankingInfo){
		log.info("Request for Net Banking: ");
		return "Payment successfull";
	}
	
}
