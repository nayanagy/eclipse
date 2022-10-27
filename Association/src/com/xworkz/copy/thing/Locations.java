package com.xworkz.copy.thing;

public class Locations {
	public String street;
	public String city;
	public String state;
	public int pincode;
	public String country;

	public Locations(String street, String city, String state, int pincode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}

	public void showoff() {
		System.out.println(this.street);
		System.out.println(this.city);
		System.out.println(this.state);
		System.out.println(this.pincode);
		System.out.println(this.country);
	}
}
