package com.xworkz.inheritance.things;

public class City extends Capital {
	public void cityMethod() {
		City city = new City();
		Capital capital = new Capital();
		Capital ref = new City();
		Place place = new Place();
		Place ref1 = new Capital();
		Place ref2 = new City();
		Object object = new Object();
		Object ref3 = new Place();
		Object ref4 = new Capital();
		Object ref5 = new City();
		System.out.println("City is a child of capital, Capital is a child of place, place is a child of object, object is a parent class");
		System.out.println("*************************");

	}

}
