package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class SoftWareConfiguration {
	public SoftWareConfiguration() {
		System.out.println("Created SoftWareConfiguration");
	}

	@Bean
	public String softwareName() {
		System.out.println("registering softwareName");
		String ref = new String("SQL");
		return ref;
	}

	@Bean
	public double version() {
		System.out.println("registering version");
		double ref = 5.3;
		return ref;
	}

	@Bean
	public String devloper() {
		System.out.println("registering devloper");
		String ref = new String("Raymond");
		return ref;
	}

	@Bean
	public String date() {
		System.out.println("registering date");
		String ref = new String("11-01-2023");
		return ref;
	}

	@Bean
	public boolean free() {
		System.out.println("registering free");
		boolean ref = true;
		return ref;
	}
	
	

}
