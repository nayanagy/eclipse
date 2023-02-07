package com.xworkz.nayana.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.nayana")
public class ButtonConfiguration {

	public ButtonConfiguration() {
		System.out.println("Created.. " + this.getClass().getSimpleName());
	}
}
