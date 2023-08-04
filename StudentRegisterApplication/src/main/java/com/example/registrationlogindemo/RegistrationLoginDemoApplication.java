package com.example.registrationlogindemo;

import com.example.registrationlogindemo.security.JwtAuthenticationFilter;
import com.example.registrationlogindemo.security.JwtUtils;
import com.example.registrationlogindemo.service.UserService;
import com.example.registrationlogindemo.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RegistrationLoginDemoApplication {
//	private UserService userService = new UserServiceImpl();

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginDemoApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<JwtAuthenticationFilter> jwtFilter() {
		FilterRegistrationBean<JwtAuthenticationFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtAuthenticationFilter(new JwtUtils()));
		registrationBean.addUrlPatterns("/api/*"); // Apply the filter to specific endpoints
		return registrationBean;
	}

}
