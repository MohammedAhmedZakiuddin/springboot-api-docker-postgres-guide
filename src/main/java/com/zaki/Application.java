package com.zaki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	/*
		 To expose this method as en endpoint we needed to add the @GetMapping Annotations.
		 This method here is a Rest EndPoint.
	 */
	@GetMapping
	public String helloWorld(){
		return "HelloWorld Spring Boot";
	}
}
