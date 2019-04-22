package com.nt.intializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.nt.controller")
public class MVCChildInitializer {

	@Bean
	public ViewResolver IRSR() {
		InternalResourceViewResolver resolver = null;
		resolver = new InternalResourceViewResolver("/WEB-INF/pages/", ".jsp");
		return resolver;
	}

}
