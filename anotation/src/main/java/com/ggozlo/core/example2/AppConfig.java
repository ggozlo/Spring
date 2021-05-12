package com.ggozlo.core.example2;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Personal personal() {
		 Personal ps =  new Personal("πÈµŒªÍ", 24, new ArrayList<String>(Arrays.asList("√‡±∏","≥Û±∏","≈π±∏")));
		 ps.setMiddleScore(90);
		 ps.setFinalScore(97);
		 return ps;
	}
}
