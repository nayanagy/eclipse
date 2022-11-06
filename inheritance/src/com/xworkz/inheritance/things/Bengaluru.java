package com.xworkz.inheritance.things;

public class Bengaluru extends SiliconCity {
	public void bengaluruMethod() {
		Bengaluru bengaluru=new Bengaluru();
		SiliconCity siliconCity=new SiliconCity();
		SiliconCity siliconCity1=new Bengaluru();
		MetroCity metrocity=new MetroCity();
		MetroCity metroCity1=new SiliconCity();
		MetroCity metroCity2=new Bengaluru();
		City city=new City();
		City city1=new MetroCity();
		City city2=new SiliconCity();
		City city3=new Bengaluru();
		Capital capital=new Capital();
		Capital capital1=new City();
		Capital capital2=new MetroCity();
		Capital capital3=new SiliconCity();
		Capital capital4=new Bengaluru();
		Place place=new Place();
		Place place1=new Capital();
		Place place2=new City();
		Place place3=new MetroCity();
		Place place4=new SiliconCity();
		Place place5=new Bengaluru();
		Object object=new Object();
		Object object1=new Place();
		Object object2=new Capital();
		Object object3=new City();
		Object object4=new MetroCity();
		Object object5=new SiliconCity();
		Object object6=new Bengaluru();
		
		System.out.println("Bengaluru is a child of SiliconCity, Siliconcity is a child of metrocity, Metro city is child of city, City is a child of capital, Capital is a child of place, place is a child of object, object is a parent class");
		
		
		
	}
 
}
