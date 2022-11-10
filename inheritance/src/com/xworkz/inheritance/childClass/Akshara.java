package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.HR;

public class Akshara extends HR {

	@Override
	public void fire() {
		super.fire();
		System.out.println("Running fire method in akshara");
	}

	public void hire(String name) {
		System.out.println("hiring " + name);
	}

}
