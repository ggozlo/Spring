package com.ggozlo.core;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAop {
	
	
	@Pointcut("within(com.ggozlo.core.*)")
	private void publicMethod() {}
	
	// 경과시간 체크하는 공통기능 메소드\
	@Around("publicMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable { 
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + "is start.");
		long st = System.currentTimeMillis();
		
		try { // 핵심기능 메소드 실행 
			Object obj = joinPoint.proceed(); 
			return obj;
			} 
		finally { 
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "is finished."); 
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}

	
	}
	
	@Before("publicMethod()")
	public void beforeAop() {
		System.out.println("----------메소드 실행-------------");
	}

	@After("publicMethod()")
	public void afterAop() {
		System.out.println("----------메소드 종료-------------");
	}

}
