package com.ggozlo.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SampleMain {
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext context  = new GenericXmlApplicationContext(configLocation);
		ScoreDTO scoreDTO =  (ScoreDTO)context.getBean("scoreDTO");
		Test test = context.getBean("test" , Test.class);
		
		test.setScoreDTO(scoreDTO);
		test.Grade();
		
		System.out.println(scoreDTO);
	}
}
