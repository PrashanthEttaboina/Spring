package com.motivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)	
public class SpringMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=	SpringApplication.run(SpringMain.class, args);
		
		SbiBank sb=(SbiBank) context.getBean("account");
		sb.hiwithdraw();
		sb.hiaddMoney();
		sb.hideposit();
		
		
	}

}
