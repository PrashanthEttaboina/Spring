package com.motivity;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo {

	public static final Logger logger=LoggerFactory.getLogger(Demo.class);
	
	public static void main(String args[])
	{
		
		logger.error("This is an error logger ");
		ConfigurableApplicationContext cac=SpringApplication.run(Demo.class, args);
		
	}
	
}
