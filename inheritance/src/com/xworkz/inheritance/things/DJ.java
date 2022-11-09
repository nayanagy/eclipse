package com.xworkz.inheritance.things;

public class DJ {
	public String location;
	public double ticketPrice;
	public int noOfPeople;

	public DJ(String location, double ticketPrice, int noOfPeople) {
		super();
		this.location = location;
		this.ticketPrice = ticketPrice;
		this.noOfPeople = noOfPeople;
	}

	public void display() {
		System.out.println(this.location);
		System.out.println(this.noOfPeople);
		System.out.println(this.ticketPrice);
	}

}
