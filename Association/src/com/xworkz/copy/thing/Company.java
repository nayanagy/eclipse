package com.xworkz.copy.thing;

public class Company {

	public String name;
	public String type;

	public Company(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void showOff() {
		System.out.println("company Start aythu");
		System.out.println(this.name);
		System.out.println(this.type);

	}

}
