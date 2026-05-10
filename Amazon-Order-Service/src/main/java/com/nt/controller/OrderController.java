package com.nt.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.OrderInformation;
import com.nt.entity.ProductDetails;

@RestController
public class OrderController {

	
	@PostMapping("/create")
	public String createOrder(@RequestBody OrderInformation orderInformation) {
		System.out.println("Order creation request for user; "+orderInformation.getEmailId());
		return "Order created. Order ref: "+UUID.randomUUID();
	}
	
	@GetMapping("/info/{orderId}")
	public OrderInformation getUserInfo(@PathVariable(name = "orderId") String orderId) {
		System.out.println("order Information for Order Id: "+orderId);
		return new OrderInformation("test@gmail.com",
				List.of(new ProductDetails(1, "Iphone", 10000.0),new ProductDetails(2,"Laptop",55000.05)),
				66000.05);
	}	
}
