package com.xworkz.inheritance.things;

public class Catering {
	public String name;
	public Double price;
	public int no_of_staff;

	public Catering(String name, Double price, int no_of_staff) {
		super();
		this.name = name;
		this.price = price;
		this.no_of_staff = no_of_staff;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.no_of_staff);
		System.out.println(this.price);
	}
}
