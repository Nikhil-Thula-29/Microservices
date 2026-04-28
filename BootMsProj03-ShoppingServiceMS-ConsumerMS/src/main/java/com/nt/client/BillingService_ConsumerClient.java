package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


//Client is the layer used in consumer to get the details of provider where in which consumer directly wont talk with eureka server types of client are discovery client,loadbalancer client,fegin client

@Component
public class BillingService_ConsumerClient {

	@Autowired
	private LoadBalancerClient client;  //It internally uses round robbin method //lodbalancer picks less loadfactor automatically
	
	public String getBillingInfo() {
		//get loadbalancer instance through load balancing
		ServiceInstance si=client.choose("Billing-Service"); //provider application name
		
		//get the URI of Provider MS
		URI uri=si.getUri();
		
		//prepare the url from uri(eg:uri=http://localhost:8081 and url example :http://localhost:8081/billing/info
		String url=uri.toString()+"/billing-api/billing";
		
		//invoke the Provider MS b.method using RestTemplate
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> resp=template.getForEntity(url, String.class);
		String result=resp.getBody();
		return result;		
	}
}
