package com.xworkz.friday.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experience exp;
	
	public Director() {
		System.out.println("Created Director using no-arg const");
	}
}
