package com.jorgesaldivar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jorgesaldivar.filters.AddRequestHeaderFilter;

@Configuration
public class AddHeaderConfig {

	@Bean
	public AddRequestHeaderFilter addRequestHeaderFilter() {
		return new AddRequestHeaderFilter();
	}
	
}
