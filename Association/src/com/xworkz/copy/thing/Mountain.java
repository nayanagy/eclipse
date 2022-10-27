package com.xworkz.copy.thing;

public class Mountain {
	public String name;
	public Locations location = new Locations("Mullayanagiri", "Chikmagalur", "Karnataka", 577542, "India");
	public double height;
	public Temple temple = new Temple("ShivaTemple", "hindhu", 500, 3500);

	public Mountain(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}

	public void showoff() {
		System.out.println(this.name);
		System.out.println(this.height);
		this.location.showoff();
		this.temple.showoff();
	}
}
