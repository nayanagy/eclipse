package com.xworkz.inheritance.things;

public class Marriage {
	public String venue;
	public String date;
	public String brideName;

	public Marriage(String venue, String date, String brideName) {
		super();
		this.venue = venue;
		this.date = date;
		this.brideName = brideName;
	}

	public void display() {
		System.out.println(this.brideName);
		System.out.println(this.date);
		System.out.println(this.venue);
	}

}
