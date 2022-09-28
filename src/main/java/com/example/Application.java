package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//Hi we are going to change some code
                System.out.println("**************Code chnaged in Devlope branch*************");
		System.out.println("We have changed now code , plese check and let me know ");
		System.out.println("We are working in stash mode , once it will complete then only we will continue");
		SpringApplication.run(Application.class, args);
	}

}
