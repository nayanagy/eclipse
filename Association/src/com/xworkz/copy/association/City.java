package com.xworkz.copy.association;

public class City {

	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;

	public City(Name name, boolean capital, double areaInSquareKilometers)

	{
		this.capital = capital;
		this.areaInSquareKilometers = areaInSquareKilometers;
		this.name = name;
	}

	public void see() {
		System.out.println(this.capital);
		System.out.println(this.areaInSquareKilometers);
		if (name != null) {

			this.name.display();
			System.out.println();

		}

		else {
			System.out.println("name is null");
		}
	}

}
