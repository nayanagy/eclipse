package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(" com.xworkz.spring2")
public class SoftWareEngineerConfiguration {
	public SoftWareEngineerConfiguration() {
		System.out.println("Created SoftWareEngineerConfiguration");
	}

	@Bean
	public String engineerName() {
		System.out.println("registering name");
		String ref = new String("Nishitha");
		return ref;
	}

	@Bean
	public double salary() {
		System.out.println("registering salary");
		Double ref = new Double(30000);
		return ref;
	}

	@Bean
	public String softWareCompanyName() {
		System.out.println("registering companyName");
		String ref = new String("kyndrl");
		return ref;
	}

	@Bean
	public double experience() {
		System.out.println("registering companyName");
		Double ref = new Double(1.5);
		return ref;
	}

}
