package com.xworkz.devil.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.devil")
public class SnakeConfiguration {
	public SnakeConfiguration() {
		System.out.println("creating SnakeConfiguration");
	}
	
	@Bean
	public String snakeName() {
		System.out.println("registering snakeName");
		return "Cobra";
	}
	
	@Bean
	public String snakeColor() {
		System.out.println("registering snakeColor");
		return "Black";
	}
	
	@Bean
	public double snakeLength() {
		System.out.println("registering snakeLength");
		return 5.3;
	}
	
	@Bean
	public String snakeType() {
		System.out.println("registering snakeType");
		return "";
	}
	
	@Bean
	public boolean snakePoisionous() {
		System.out.println("registering snakePoisionous");
		return true;
	}
	
}
