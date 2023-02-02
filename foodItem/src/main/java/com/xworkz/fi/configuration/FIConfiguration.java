package com.xworkz.fi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.fi")
public class FIConfiguration {
	public FIConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
