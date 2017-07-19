package com.jvaldenor.feign.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientApplication.class, args);
	}
}