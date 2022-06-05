package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class OauthSecurityConfiguration {
	
	protected void configure(HttpSecurity http) throws Exception{
		http
		    .authorizeRequests()
		    .anyRequest()
		    .authenticated()
		    .and()
		    .oauth2Login();
	}
}
