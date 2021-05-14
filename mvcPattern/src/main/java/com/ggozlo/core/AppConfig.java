package com.ggozlo.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Person person() {
		return new Person("백두산", "010-1234-1234", "수원시 팔달구");
	}
	
	@Bean
	public PersonInfo personInfo() {
		return new PersonInfo("UserA", "1234", "홍길동", "010-4567-8912", "user@uer.com");
	}
	
	@Bean 
	public Score score() {
		return new Score();
	}
	
	@Bean 
	public ScoreCal scoreCal() {
		return new ScoreCal(score());
	}
}
