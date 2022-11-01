package com.xworkz.copy.association.task;

public class Location {
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;

	public Location(int no, String street, City city, State state, Country country) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public void show() {
		System.out.println(this.no);
		System.out.println(this.street);

		// null check for state(state:custom)
		if (state != null) {
			this.state.see();
		} else {
			System.out.println("state is null");
		}

		// null check for city(city:custom)
		if (city != null) {
			this.city.showoff();
		} else {
			System.out.println("city is null");
		}
		
		// null check for country(country:custom)
		if (country != null) {
			this.country.display();
		} else {
			System.out.println("country is null");
		}
	}

}
