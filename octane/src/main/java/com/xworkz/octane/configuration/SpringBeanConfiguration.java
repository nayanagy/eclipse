package com.xworkz.octane.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.octane")
public class SpringBeanConfiguration {
	public SpringBeanConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
