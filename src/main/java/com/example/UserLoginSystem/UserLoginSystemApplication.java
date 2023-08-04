package com.example.UserLoginSystem;

import com.example.UserLoginSystem.security.JwtAuthenticationFilter;
import com.example.UserLoginSystem.security.JwtUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserLoginSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserLoginSystemApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<JwtAuthenticationFilter> jwtFilter() {
		FilterRegistrationBean<JwtAuthenticationFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtAuthenticationFilter(new JwtUtils()));
		registrationBean.addUrlPatterns("/api/*");
		return registrationBean;
	}

}
