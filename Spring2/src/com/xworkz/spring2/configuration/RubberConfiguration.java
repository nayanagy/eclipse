package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class RubberConfiguration {
	public RubberConfiguration() {
		System.out.println("Created RubberConfiguration");
	}

	@Bean
	public String rubberName() {
		System.out.println("registering rubberName ");
		String ref = new String("Apsara");
		return ref;
	}

	@Bean
	public String rubberType() {
		System.out.println("registering rubberType");
		String ref = new String("Solid");
		return ref;
	}

	@Bean
	public Double rubberPrice() {
		System.out.println("registering rubberPrice");
		Double ref = new Double(5);
		return ref;
	}

	@Bean
	public String rubberColor() {
		System.out.println("registering rubberColor");
		String ref = new String("White");
		return ref;
	}

	@Bean
	public String rubberShape() {
		System.out.println("registering rubberShape");
		String ref = new String("Rectangle");
		return ref;
	}

	@Bean
	public Boolean rubberStolen() {
		System.out.println("registering rubberStolen");
		Boolean ref = new Boolean(true);
		return ref;
	}

}
