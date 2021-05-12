package com.ggozlo.core.eat;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EatMain {
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configLocation);
		Eat eat = context.getBean("eat",Eat.class);
		eat.eat();
	}
}
