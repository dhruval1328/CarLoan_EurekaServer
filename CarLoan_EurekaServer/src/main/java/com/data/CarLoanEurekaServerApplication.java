package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class CarLoanEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarLoanEurekaServerApplication.class, args);
	}

}
