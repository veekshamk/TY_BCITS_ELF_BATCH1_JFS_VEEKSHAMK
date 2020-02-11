package com.bcits.springsecurityrest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import com.bcits.springsecurityrest.CustomUsernamePasswordAuthenticationFilter;
import com.bcits.springsecurityrest.MySimpleUrlAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class EmployeesecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private AuthenticationEntryPoint restAuthenticationEntryPoint;
	
	@Autowired
	private MySimpleUrlAuthenticationSuccessHandler successHandler;
	
	@Bean 
	SimpleUrlAuthenticationFailureHandler getFailureHandler() {
		return new SimpleUrlAuthenticationFailureHandler();
	}
	
	@Bean
	public CustomUsernamePasswordAuthenticationFilter getUsernamePasswordAuthenticationFilter() throws Exception{
		CustomUsernamePasswordAuthenticationFilter filter = new CustomUsernamePasswordAuthenticationFilter();
		
		filter.setAuthenticationSuccessHandler(successHandler);
		filter.setAuthenticationFailureHandler(getFailureHandler());
		filter.setAuthenticationManager(authenticationManager());
		
		return filter;
	}
	
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.exceptionHandling()
		.authenticationEntryPoint(restAuthenticationEntryPoint)
		.and()
		.authorizeRequests()
		.antMatchers("/getEmployee").permitAll()
		.and()
		.authorizeRequests()
		.antMatchers("/getAllEmployees").permitAll()
		.and()
		.addFilterBefore(getUsernamePasswordAuthenticationFilter(), CustomUsernamePasswordAuthenticationFilter.class)
		.logout();
	}

}