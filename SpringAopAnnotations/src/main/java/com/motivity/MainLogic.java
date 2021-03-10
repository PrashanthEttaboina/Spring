package com.motivity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
		SbiBank cb= (SbiBank) context.getBean("account");
		cb.hideposit();
		cb.hiwithdraw();
		cb.hiaddMoney();
	}
}
