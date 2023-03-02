package com.saksoft.springrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class SpringrestApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringrestApplication.class);
	public static void main(String[] args) {
		logger.info("Application started..");
		SpringApplication.run(SpringrestApplication.class, args);
	}
	
	
}
