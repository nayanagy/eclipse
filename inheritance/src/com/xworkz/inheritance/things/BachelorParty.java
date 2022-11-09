package com.xworkz.inheritance.things;

public class BachelorParty {
	public String location;
	public int noOfPeople;
	public String organizer;

	public BachelorParty(String location, int noOfPeople, String organizer) {
		super();
		this.location = location;
		this.noOfPeople = noOfPeople;
		this.organizer = organizer;
	}

	public void display() {
		System.out.println(this.location);
		System.out.println(this.noOfPeople);
		System.out.println(this.organizer);
	}

}
