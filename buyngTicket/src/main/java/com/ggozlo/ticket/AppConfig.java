package com.ggozlo.ticket;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.support.TransactionTemplate;

@Configuration
@ComponentScan(
		basePackages = "com.ggozlo.ticket",
		excludeFilters = @Filter(type = FilterType.ANNOTATION, value = Controller.class)
		)
public class AppConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("ggozlo");
		dataSource.setPassword("ggozlo");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
	@Bean 
	public TransactionTemplate transactionTemplate() {
		return new TransactionTemplate(dataSourceTransactionManager());
	}
	
	@Bean(name = "dao")
	public OracleTicketRepository oracleTicketRepository() {
		return new OracleTicketRepository(jdbcTemplate(), transactionTemplate());
	}
}
