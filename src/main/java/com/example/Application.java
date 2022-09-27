package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//Hi we are going to change some code
		System.out.println("We have changed now code , plese check and let me know ");
		SpringApplication.run(Application.class, args);
	}

}
