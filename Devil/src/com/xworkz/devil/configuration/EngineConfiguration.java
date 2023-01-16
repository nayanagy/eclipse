package com.xworkz.devil.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.devil")
public class EngineConfiguration {
	public EngineConfiguration() {
		System.out.println("creating EngineConfiguration");
	}
	
	@Bean
	public String engineName() {
		System.out.println("registering engineName");
		return "Car Engine";
	}
	
	@Bean
	public String engineType() {
		System.out.println("registering engineType");
		return "Petrol Engine";
	}
	
	@Bean
	public long engineNumber() {
		System.out.println("registering engineNumber");
		return 694567;
	}
	
	@Bean
	public double engineVersion() {
		System.out.println("registering engineVersion");
		return 5.6;
	}
	
	@Bean
	public String engineCompany() {
		System.out.println("registering engineCompany");
		return "Tata";
	}
	
	@Bean
	public int engineStrokes() {
		System.out.println("registering engineStrokes");
		return 4;
	}

}
