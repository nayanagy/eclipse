package com.xworkz.inheritance.things;

public class MetroCity extends City {
	public void metrocityMethod() {
		MetroCity metro = new MetroCity();
		City city = new City();
		City ref = new MetroCity();
		Capital capital = new Capital();
		Capital ref1 = new City();
		Capital ref2 = new MetroCity();
		Place Place = new Place();
		Place ref3 = new Capital();
		Place ref4 = new City();
		Place ref5 = new MetroCity();
		Object object = new Object();
		Object ref6 = new Place();
		Object ref7 = new Capital();
		Object ref8 = new City();
		Object ref9 = new MetroCity();

		System.out.println(
				"Metro city is child of city, City is a child of capital, Capital is a child of place, place is a child of object, object is a parent class");
		System.out.println("*************************");
	}

}
