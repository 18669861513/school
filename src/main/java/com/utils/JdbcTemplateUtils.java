package com.utils;

import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

public class JdbcTemplateUtils {

	private static JdbcTemplate jdbcTemplate;
	
	public static JdbcTemplate jdbcTemplate(){
		if(jdbcTemplate == null){
			jdbcTemplate = createJdbcTemplate();
		}
		return jdbcTemplate;
	}
	
	private static JdbcTemplate createJdbcTemplate(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/shiro");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return new JdbcTemplate(dataSource);
	}
}
