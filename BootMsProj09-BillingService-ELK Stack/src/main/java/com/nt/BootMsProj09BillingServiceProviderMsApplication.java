package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j  //this equals=Logger logger=LogFactory.getLogger(BootMsProj09BillingServiceProviderMsApplication.class)
public class BootMsProj09BillingServiceProviderMsApplication {

	public static void main(String[] args) {
		log.info("start the main method--BillingMs");
		SpringApplication.run(BootMsProj09BillingServiceProviderMsApplication.class, args);
		log.info("App is boot straped--BillingMs");
		log.info("end of application--BillingMs");
	}
}
