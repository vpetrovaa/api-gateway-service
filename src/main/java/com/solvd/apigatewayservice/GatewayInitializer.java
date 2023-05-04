package com.solvd.apigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GatewayInitializer.class, args);
	}

}
