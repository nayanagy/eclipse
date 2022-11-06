package com.xworkz.inheritance.things;

public class Place extends Object {
	public void placeMethod() {
		System.out.println("Object is a Parent & Place is a Child");
		System.out.println("*************************");
		Object object = new Object();
		Place place = new Place();
		Object ref = new Place();
	}

}
