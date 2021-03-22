package com.vidvaan.test;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionTest {
	
	public static void main(String[] args) throws SQLException {
//		BasicDataSource basicDataSource = new BasicDataSource();
//		basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
//		basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//		basicDataSource.setUsername("mydb");
//		basicDataSource.setPassword("satya");
//		
//		System.out.println(basicDataSource);
//		System.out.println(basicDataSource.getConnection());
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(applicationContext.getBean("dataSource"));
		
	}

}
