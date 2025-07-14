package com.cognizant.spring_jwt_custom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtAppRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJwtAuthApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JwtAppRunner.class, args);
		LOGGER.info("JWT Auth App started by Shanvi");
	}
}
