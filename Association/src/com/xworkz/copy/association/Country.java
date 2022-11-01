package com.xworkz.copy.association;

public class Country {
	public String name;
	public City[] cities;
	public President president;

	public Country(String name) {
		this.name = name;

	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public void letMeSee() {
		if (cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];

				if (city != null) {
					city.see();
				}
			}
		} else {
			System.out.println("city is null");
		}

		if (president != null) {

			this.president.show();

		} else {
			System.out.println("President is null");
		}

		System.out.println(this.name);

	}
}
