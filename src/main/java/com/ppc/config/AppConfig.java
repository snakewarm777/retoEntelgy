package com.ppc.config;

import java.util.Locale;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import com.ppc.bean.UserResponse;


@Configuration
@ComponentScan(basePackages = "com.ppc")
public class AppConfig {
	
	 @Autowired
	    private Environment env;
	 	
		@Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
		   // Do any additional configuration here
		   return builder.build();
		}
	 
		@Bean
		public UserResponse userResponse() {
		   // Do any additional configuration here
		   return new UserResponse();
		}
	   
	    
}
