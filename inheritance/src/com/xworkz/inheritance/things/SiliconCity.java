package com.xworkz.inheritance.things;

public class SiliconCity extends MetroCity {
	public void siliconCityMethod() {
		SiliconCity siliconcity=new SiliconCity();
		MetroCity metro=new MetroCity();
		MetroCity ref=new SiliconCity();
		City city=new City();
		City ref1=new MetroCity();
		City ref2=new SiliconCity();
		Capital capital=new Capital();
		Capital ref3=new City();
		Capital ref4=new MetroCity();
		Capital ref5=new SiliconCity();
		Place place=new Place();
		Place ref6=new Capital();
		Place ref7=new City();
		Place ref8=new MetroCity();
		Place ref9=new SiliconCity();
		Object object=new Object();
		Object object1=new Place();
		Object object2=new Capital();
		Object object3=new City();
		Object object4=new MetroCity();
		Object object5=new SiliconCity();
		

		System.out.println(
				"Siliconcity is a child of metrocity, Metro city is child of city, City is a child of capital, Capital is a child of place, place is a child of object, object is a parent class");
		System.out.println("*************************");
	}
}
