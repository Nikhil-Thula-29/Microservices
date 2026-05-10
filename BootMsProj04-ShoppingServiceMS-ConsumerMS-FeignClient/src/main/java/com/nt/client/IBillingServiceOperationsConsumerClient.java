package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Billing-Service") //here this @Feignclient with service name of billing service as it is provider and on top of main we have @EnableFeignClient also imp. This inteface creats in memory proxy class
public interface IBillingServiceOperationsConsumerClient {

	@GetMapping("/billing-api/billing") //same endpoint in that controller
	public ResponseEntity<String> getPaymentOptions(); //with any method name but matches with return type of producer MS
}
