package com.microservice.service.registory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceRegistoryApplication {
	@GetMapping("/")
	public  String welcome(){
		return "hii ci/cd is working";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistoryApplication.class, args);
	}

}
