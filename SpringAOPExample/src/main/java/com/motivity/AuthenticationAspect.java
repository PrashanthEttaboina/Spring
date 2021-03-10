package com.motivity;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;  

public class AuthenticationAspect implements MethodBeforeAdvice {
	

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Authentication is done");
		
	}
}
