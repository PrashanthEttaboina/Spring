package com.motivity;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

	@Bean
	public AuthenticationAspect authenticate()
	{
		return new AuthenticationAspect();
	}

	@Bean 
	public LoggingAspect logging()
	{
		return new LoggingAspect();
	}
	
//	@Bean 
//	public Account getAccount()
//	{
//		return new Account();
//	}
	
	@Bean 
	public ProxyFactoryBean getProxy()
	{
		ProxyFactoryBean pf=new ProxyFactoryBean();		
		pf.setInterfaces(SbiBank.class);		
		pf.setInterceptorNames("authenticate","logging");
//		pf.setTargetClass(Account.class);		
		Account acc=new Account();		
		pf.setTarget(acc);		
		return pf;
		
	}
	
}
