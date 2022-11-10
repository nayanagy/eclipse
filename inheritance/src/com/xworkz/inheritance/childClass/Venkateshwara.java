package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.PetrolBunk;

public class Venkateshwara extends PetrolBunk {
	@Override
	public void petrol() {
		super.petrol();
		System.out.println("Running petrol method in Venkateshwara");

	}

	public void petrol(String name) {
		System.out.println("petrol " + name);
	}

}
