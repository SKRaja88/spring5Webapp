package com.springG.Springboot.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStarterApplication  {

	private static final Logger log =   LoggerFactory.getLogger(SpringbootStarterApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(SpringbootStarterApplication.class, args);



	}

}
