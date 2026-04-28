package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //Imp in all ms we need to write this in producer and consumer
public class BootMsProj04BillingServiceProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj04BillingServiceProviderMsApplication.class, args);
	}

}
