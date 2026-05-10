package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class BootMsProj09ShoppingServiceMsConsumerMsApplication {

	public static void main(String[] args) {
		log.info("start the main method--ShoppingMS");
		SpringApplication.run(BootMsProj09ShoppingServiceMsConsumerMsApplication.class, args);
		log.info("App is boot straped--ShoppingMS");
		log.info("end of application--ShoppingMS");
	}

}
