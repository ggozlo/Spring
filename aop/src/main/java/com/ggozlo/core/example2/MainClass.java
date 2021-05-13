package com.ggozlo.core.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
	
		String configLocation = "classpath:appConfigCTX.xml";
		ApplicationContext context = new GenericXmlApplicationContext(configLocation);
		ApplicationContext context1 = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student = context.getBean("student1", Student.class);
		Person person = context
			.getBean("person", Person.class);
		
		String [] arr = context.getBeanDefinitionNames();
		for(String name:arr)
		{
			System.out.println(name);
		}
		
		student.out();
		person.out();
	}
}
