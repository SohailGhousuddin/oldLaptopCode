package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemonsApplication {

	
	public static void main(String[] args) {
		//SpringApplication.run(DemonsApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(DemonsApplication.class, args);
	
		
	/*	for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
		
		
	}
}
