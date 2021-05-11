package com.ggozlo.core.sal;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SalMain {
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext context  = new GenericXmlApplicationContext(configLocation);
		
		
		Salary salary = context.getBean("salary", Salary.class);
		salary.check(6000);
	}
}
