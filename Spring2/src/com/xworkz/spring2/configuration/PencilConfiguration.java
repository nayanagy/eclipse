package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class PencilConfiguration {
	public PencilConfiguration() {
		System.out.println("Created PencilConfiguration");
	}

	@Bean
	public String pencilName() {
		System.out.println("registering pencilName ");
		String ref = new String("Apsara");
		return ref;
	}

	@Bean
	public String pencilType() {
		System.out.println("registering pencilType ");
		String ref = new String("PencilWithRubber");
		return ref;
	}

	@Bean
	public Double pencilPrice() {
		System.out.println("registering pencilPrice ");
		Double ref = new Double(5);
		return ref;
	}

	@Bean
	public String pencilColor() {
		System.out.println("registering pencilColor ");
		String ref = new String("Black");
		return ref;
	}

	@Bean
	public boolean pencilSharp() {
		System.out.println("registering pencilSharp ");
		boolean ref = true;
		return ref;
	}

	@Bean
	public boolean pencilStolen() {
		System.out.println("registering pencilStolen ");
		boolean ref = false;
		return ref;
	}

}
