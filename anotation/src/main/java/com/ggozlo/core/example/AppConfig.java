package com.ggozlo.core.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Region region() {
		Region reg = new Region(5000000L, 1000000L, 500000L);
		reg.setCredit(new Credit("¼­¿ï", "010-1111-1111", 15000000L));
		return reg;
	}
}
