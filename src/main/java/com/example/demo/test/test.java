package com.example.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class test extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(test.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Azure!";
	}
}
