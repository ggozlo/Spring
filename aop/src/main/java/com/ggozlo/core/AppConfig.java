package com.ggozlo.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student student() {
		return new Student("È«±æµ¿", 13, "010-1234-1234");
	}
	
	@Bean 
	public Worker worker() {
		return new Worker("È«±æµ¿", 13, "°³¹ßÀÚ");
	}
}
