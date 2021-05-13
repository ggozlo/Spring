package com.ggozlo.core.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Person person() {
		return new Person();
	}
	
	@Bean
	public Student student() {
		return new Student();
	}
}
