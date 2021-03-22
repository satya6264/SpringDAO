package com.vidvaan.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = { "com.vidvaan" })
@PropertySource(value = { "classpath:db.properties" })
public class SpringConfig {

	@Autowired
	private Environment env;

	public BasicDataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(env.getProperty("url"));
		basicDataSource.setDriverClassName(env.getProperty("driverClassName"));
		basicDataSource.setUsername(env.getProperty("uname"));
		basicDataSource.setPassword(env.getProperty("password"));
		return basicDataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
}
