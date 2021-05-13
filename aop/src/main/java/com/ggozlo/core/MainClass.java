package com.ggozlo.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		String configLocation = "classpath:appConfigCTX.xml";
		ApplicationContext context = new GenericXmlApplicationContext(configLocation);
		Student student = context.getBean("student", Student.class);
		Worker worker = context.getBean("worker", Worker.class);
		
		String [] arr = context.getBeanDefinitionNames();
		for(String name:arr)
		{
			System.out.println(name);
		}
		
		student.out();
		worker.out();
	}
}
