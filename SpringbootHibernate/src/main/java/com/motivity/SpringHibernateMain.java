package com.motivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringHibernateMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(SpringHibernateMain.class, args);
		
		MainOperator mo=cac.getBean(MainOperator.class);
			
		mo.logic();	
								
	}

}
