package com.xworkz.inheritance.things;

public class Capital extends Place {
	public void capitalMethod() {
		Place place = new Place();
		Capital capital = new Capital();
		Place ref = new Capital();
		Object ref2 = new Place();
		Object ref3 = new Capital();
		Object ref4 = new Object();
		System.out.println("Capital is a child of place,Place is a child of object,Object is a parent class");
		System.out.println("*************************");

	}

}
