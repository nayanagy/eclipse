package com.xworkz.friday.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director direct;
	@Autowired
	private Producer produce;

	public Movie() {
		System.out.println("Created Movie using no-arg const");
	}
}
