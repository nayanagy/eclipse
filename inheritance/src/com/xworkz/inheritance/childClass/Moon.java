package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.Satellite;

public class Moon extends Satellite {
	public String colour;
	public Moon(String type, double travelPerHour,String colour) {
		super(type,travelPerHour);
		this.colour=colour;
		

	}
	
	public void display() {
		
		super.display();
		System.out.println(colour);
	}

}
