package com.ggozlo.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student student() {
		return new Student("ȫ�浿", 13, "010-1234-1234");
	}
	
	@Bean 
	public Worker worker() {
		return new Worker("ȫ�浿", 13, "������");
	}
}
