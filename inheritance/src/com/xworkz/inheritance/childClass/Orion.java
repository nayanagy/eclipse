package com.xworkz.inheritance.childClass;

import com.xworkz.inheritance.things.ShoppingMall;

public class Orion extends ShoppingMall {
	public int noOfShops;

	public Orion(String location, int noOfFloors, int noOfShops) {
		super(location, noOfFloors);
		this.noOfShops = noOfShops;

	}

	public void display() {
		super.display();
		System.out.println(this.noOfShops);

	}

}
