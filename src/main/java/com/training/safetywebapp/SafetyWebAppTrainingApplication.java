package com.training.safetywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SafetyWebAppTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafetyWebAppTrainingApplication.class, args);
	}

}
