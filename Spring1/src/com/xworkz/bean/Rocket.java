package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("India")
	private String country;
	@Value("PSLV")
	private String name;
	@Value("75000")
	private double budget;

	public Rocket() {
		System.out.println("Creating Rocket using default const by Spring");
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

}
