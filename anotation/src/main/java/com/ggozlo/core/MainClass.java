package com.ggozlo.core;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Score score = context.getBean("score", Score.class);
//		System.out.println(score.toString());
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext xmlContext = new GenericXmlApplicationContext(configLocation);
		Score scoreA = xmlContext.getBean("scoreA", Score.class);
		Score scoreB = xmlContext.getBean("scoreB", Score.class);
		Score scoreC = xmlContext.getBean("scoreC", Score.class);
		
		System.out.println(scoreA);
		System.out.println(scoreB);
		System.out.println(scoreC);
		
		AbstractApplicationContext annoContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Score scoreD = annoContext.getBean("scoreD", Score.class);
		Score scoreE = annoContext.getBean("scoreE", Score.class);
		Score scoreF = annoContext.getBean("scoreF", Score.class);
		Test test = annoContext.getBean("test", Test.class);
		
		System.out.println(scoreD);
		test.Grade(scoreD);
		System.out.println(scoreE);
		test.Grade(scoreE);
		System.out.println(scoreF);
		test.Grade(scoreF);
	}
}
