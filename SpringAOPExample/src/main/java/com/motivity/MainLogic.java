package com.motivity;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainLogic {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Configure.class);
		
		SbiBank sb=(SbiBank) context.getBean("getProxy");
		sb.deposit();
		sb.withdraw();
	}

}
