package com.ggozlo.core.goods;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class GoodsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configLocation);
		
		Product product1, product2;
		product1 = context.getBean("product1", Product.class);
		product2 = context.getBean("product2", Product.class);
		
		System.out.println(product1);
		System.out.println(product2);
	}

}