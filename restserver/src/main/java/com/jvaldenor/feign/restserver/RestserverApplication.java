package com.jvaldenor.feign.restserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RestserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserverApplication.class, args);
	}
}
