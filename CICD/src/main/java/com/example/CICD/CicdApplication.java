package com.example.CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	public String welcome() {
		return "Welcome to nguyenvu channel";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
