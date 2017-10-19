package com.example.eurekaservicedemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaservicedemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaservicedemo1Application.class, args);
	}
}
