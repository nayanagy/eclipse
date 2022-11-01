package com.xworkz.copy.association.task;

public class City {
	public String cityName;
	public double areaInSquareKilometers;
	public long pincode;
	public String State;

	public City(String cityName, double areaInSquareKilometers, long pincode, String state) {
		super();
		this.cityName = cityName;
		this.areaInSquareKilometers = areaInSquareKilometers;
		this.pincode = pincode;
		State = state;
	}

	public void showoff() {
		System.out.println(this.cityName);
		System.out.println(this.areaInSquareKilometers);
		System.out.println(this.pincode);
		System.out.println(this.State);
	}
}
