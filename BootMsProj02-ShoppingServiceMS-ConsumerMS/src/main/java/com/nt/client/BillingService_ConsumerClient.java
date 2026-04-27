package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


//Client is the layer used in consumer to get the details of provider where in which consumer directly wont talk with eureka server types of client are discovery client,loadbalancer client,fegin client

@Component
public class BillingService_ConsumerClient {

	@Autowired
	private DiscoveryClient client;
	
	public String getBillingInfo() {
		//get Provider MS service Instance
		//ServiceInstance represents a single running instance of a microservice (host, port, URI) returned by the DiscoveryClient.
		List<ServiceInstance> list=client.getInstances("Billing-Service"); //instance name in billing service
		
		//get the first instance
		ServiceInstance si= list.get(0);  //we are using discovery client so no load balancing direct single instance only
		
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
