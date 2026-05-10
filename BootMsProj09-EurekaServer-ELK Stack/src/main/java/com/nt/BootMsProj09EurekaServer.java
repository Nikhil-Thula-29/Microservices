package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class BootMsProj09EurekaServer {

	public static void main(String[] args) {
		log.info("start of the Application--Eureka server");
		SpringApplication.run(BootMsProj09EurekaServer.class, args);
		log.info("Application is bootstrapped--Eureka server");
		log.info("End of Application--Eureka server");
	}

}
