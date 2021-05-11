package com.ggozlo.core.member;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configLocation);
		
		Member member1, member2;
		member1 = context.getBean("member1", Member.class);
		member2 = context.getBean("member2", Member.class);
		
		System.out.println(member1);
		System.out.println(member2);
	}

}
