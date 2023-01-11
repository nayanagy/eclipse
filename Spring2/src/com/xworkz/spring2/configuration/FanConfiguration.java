package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class FanConfiguration {
	public FanConfiguration() {
		System.out.println("Created FanConfiguration");
	}

	@Bean
	public String fanName() {
		String ref = new String("usha");
		return ref;
	}

	@Bean
	public String fanColor() {
		String ref = new String("blue");
		return ref;
	}

	@Bean
	public double fanPrice() {
		double ref = 30000;
		return ref;
	}

	@Bean
	public boolean fanWorking() {
		boolean ref = true;
		return ref;
	}

	@Bean
	public int fanButtons() {
		int ref = 4;
		return ref;
	}

	@Bean
	public String fanCompany() {
		String ref = new String("Crompton");
		return ref;
	}

	@Bean
	public double fanVolts() {
		double ref = 20;
		return ref;
	}

	@Bean
	public String fangstno() {
		String ref = new String("gst34");
		return ref;
	}

	@Bean
	public int wings() {
		int ref = 3;
		return ref;
	}

}
