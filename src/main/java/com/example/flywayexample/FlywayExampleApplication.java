package com.example.flywayexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example.flywayexample" })
public class FlywayExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlywayExampleApplication.class, args);
	}
}
