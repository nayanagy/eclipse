package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Director;

public class Raksha extends Director {
	public String gender;

	public Raksha(String movie, int experience, String gender) {
		super(movie, experience);
		this.gender = gender;
	}

	public void display() {
		super.display();
		System.out.println(gender);
	}

}
