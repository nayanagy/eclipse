package com.xworkz.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bean.Actor;
import com.xworkz.bean.Rocket;
import com.xworkz.bean.Season;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration");
	}

	@Bean
	public Rocket gSLVRocket() {
		System.out.println("Registering gSLVRocket with spring");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Actor serialActor() {
		System.out.println("Registering serialActor with spring");
		Actor ac = new Actor("VijaySUrya", "Kannada", 30);
		return ac;

	}

	@Bean
	public Season nature() {
		System.out.println("Registering nature with spring");
		Season season = new Season();
		season.setName("Rainy");
		season.setDuration(2);
		season.setStartingMonth("June");
		return season;

	}

}
