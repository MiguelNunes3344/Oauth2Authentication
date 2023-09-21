package com.security.security.config;

import javax.sql.DataSource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class UserStoreConfig {
	
	@Bean
	UserDetailsManager users(DataSource dataSource) {
		String pass = "$2a$10$zCaQ6PTnPWJnQyBrbnh5y.Py7tNmDfRyDHqDzwCVtlvVyJGqpENO6";
		UserDetails user = User.builder()
			.username("user")
			.password("{bcrypt}"+pass)
			.roles("USER")
			.build();
		
		UserDetails admin = User.builder()
			.username("admin")
			.password(("{bcrypt}$2a$10$zCaQ6PTnPWJnQyBrbnh5y.Py7tNmDfRyDHqDzwCVtlvVyJGqpENO6"))
			.roles("USER", "ADMIN")
			.build();
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
		users.createUser(user);
		users.createUser(admin);
		return users;
	}
	
	
}
