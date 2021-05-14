package com.ggozlo.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Person person() {
		return new Person("��λ�", "010-1234-1234", "������ �ȴޱ�");
	}
	
	@Bean
	public PersonInfo personInfo() {
		return new PersonInfo("UserA", "1234", "ȫ�浿", "010-4567-8912", "user@uer.com");
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
