package core.ggozlo.db;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;



@Configuration
@ComponentScan(
		basePackages = "core.ggozlo.db",
		excludeFilters = @Filter( type = FilterType.ANNOTATION, value = Controller.class)
		)
public class AppConfig {
	
	
@Bean
public DataSource dataSource() {
	HikariConfig config = new HikariConfig();
	config.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
	config.setUsername("ggozlo");
	config.setPassword("ggozlo");
	config.isAutoCommit();
	return new HikariDataSource(config);
}

}
