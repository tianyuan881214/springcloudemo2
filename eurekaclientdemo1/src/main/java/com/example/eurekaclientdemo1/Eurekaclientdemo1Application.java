package com.example.eurekaclientdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaclientdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaclientdemo1Application.class, args);
	}
}
