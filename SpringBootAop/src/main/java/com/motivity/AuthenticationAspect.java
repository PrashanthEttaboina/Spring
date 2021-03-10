package com.motivity;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

	@Before("execution(public void hideposit())||execution(public void hiwithdraw())")
	public void authenticate()
	{
		System.out.println("Authentication is done");
	}
	
	@AfterReturning("execution(public void hideposit())")
	public void exit()
	{
		System.out.println("Exiting the process");
	}
	
	@After("execution(* hideposit())")
	public void runAfter()
	{
		System.out.println("After method is under execution");
	}
	
	@Around("execution(* hideposit())")
	public void aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable
	{
		
		System.out.println("this is around before");
		
		joinPoint.proceed();
		
		System.out.println("This is around after join point proceed"+joinPoint.getSignature());//Signature returns the method name which is under execution
	}
	
	
}
