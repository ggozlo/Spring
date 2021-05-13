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
	
	// ����ð� üũ�ϴ� ������ �޼ҵ�\
	@Around("publicMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable { 
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + "is start.");
		long st = System.currentTimeMillis();
		
		try { // �ٽɱ�� �޼ҵ� ���� 
			Object obj = joinPoint.proceed(); 
			return obj;
			} 
		finally { 
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "is finished."); 
			System.out.println(signatureStr + " ����ð� : " + (et - st));
		}

	
	}
	
	@Before("publicMethod()")
	public void beforeAop() {
		System.out.println("----------�޼ҵ� ����-------------");
	}

	@After("publicMethod()")
	public void afterAop() {
		System.out.println("----------�޼ҵ� ����-------------");
	}

}
