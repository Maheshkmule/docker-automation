package com.springbootexampleauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerAutomationApplication {
	
	@GetMapping
	public String get() {
		return "Application deployed on docker";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerAutomationApplication.class, args);
	}

}
