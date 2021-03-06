package com.fatih.hrapp;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
		
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login.html", "/", "/newJobApplication").permitAll();
		http.authorizeRequests().anyRequest().authenticated();
		http.formLogin().loginPage("/login.html").loginProcessingUrl("/login").failureUrl("/login.html?loginFailed=true");
		//http.rememberMe().userDetailsService(userDetailsService);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
	}
	
	
}
