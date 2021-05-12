package com.ggozlo.core.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configLocation);
		Personal personal = context.getBean("personal", Personal.class);
		System.out.println(personal);
		
		AbstractApplicationContext annoContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Personal personal2 = annoContext.getBean("personal", Personal.class);
		System.out.println(personal2);
	}
}
