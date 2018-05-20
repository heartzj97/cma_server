package com.cma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class CorsConfig {
	@Bean
	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
	}
}
