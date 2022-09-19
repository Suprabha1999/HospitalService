package com.mindtree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerDoctorPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerDoctorPatientApplication.class, args);
	}

}
