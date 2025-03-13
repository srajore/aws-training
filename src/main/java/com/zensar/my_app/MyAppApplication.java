package com.zensar.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MyAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
		System.out.println("Hi");
	}

	

	
}
