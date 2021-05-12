package com.ggozlo.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Score scoreD() {
		return new Score("StudentD",98,87,90);
	}
	
	@Bean
	public Score scoreE() {
		return new Score("StudentE",98,76,54);
	}
	
	@Bean
	public Score scoreF() {
		return new Score("StudentF",96,85,74);
	}

	@Bean 
	public Test test() {
		return new Test(90,75,65);
	}
}
