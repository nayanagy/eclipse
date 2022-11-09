package com.xworkz.inheritance.things;

public class ShoppingMall {
	public String location;
	public int noOfFloors;

	public ShoppingMall(String location, int noOfFloors) {
		super();
		this.location = location;
		this.noOfFloors = noOfFloors;
	}

	public void display() {
		System.out.println(this.location);
		System.err.println(this.noOfFloors);
	}

}
