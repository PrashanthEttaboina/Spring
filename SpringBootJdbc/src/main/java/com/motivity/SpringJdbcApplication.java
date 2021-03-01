package com.motivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cac=	SpringApplication.run(SpringJdbcApplication.class, args);
		MainLogic ml=cac.getBean(MainLogic.class);
		ml.Logics();
	
	}

}
