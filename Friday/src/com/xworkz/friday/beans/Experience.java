package com.xworkz.friday.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	@Autowired
	private Skill skill;

	public Experience() {
		System.out.println("Created Experience using no-arg const");
	}
}
