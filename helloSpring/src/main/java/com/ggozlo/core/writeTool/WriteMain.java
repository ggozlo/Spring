package com.ggozlo.core.writeTool;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class WriteMain {
	public static void main(String[] args) {
		
		
		WriteTool writeTool = null;
		
//		writeTool = new  Pencil();
//		writeTool.write();
//		
//		writeTool = new  Ballpen();
//		writeTool.write();
//		
//		writeTool = new  ColorPen();
//		writeTool.write();
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext context  = new  GenericXmlApplicationContext(configLocation);
		
		writeTool = context.getBean("writeTool", WriteTool.class);
		writeTool.write();
		

		
	}
}
