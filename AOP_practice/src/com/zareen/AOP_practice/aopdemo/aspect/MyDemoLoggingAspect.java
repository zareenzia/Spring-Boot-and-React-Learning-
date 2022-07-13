package com.zareen.AOP_practice.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
//	@Before("execution(* add*(..))") // match on any param
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n Executing @Before advice on addAccount");
//	}

	@Pointcut("execution(* com.zareen.AOP_practice.aopdemo.DAO.*.*(..))")
	private void forDaoPackage() {}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		
	}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		
	}
	
	
	
	
	
}
