package com.xworkz.copy.association;

public class CountryRunner {

	public static void main(String[] args) {

		Country country = new Country("India");
		President president = new President("Droupadi Murmu");

		president.setGender(Gender.FEMALE);

		country.setPresident(president);

		Name name1 = new Name("A", "B", "C");
		City city1 = new City(name1, true, 10.2);

		Name name2 = new Name("D", "E", null);

		City city2 = new City(name2, false, 34.3);

		City[] cit = { city1, city2 };
		country.setCities(cit);

		country.letMeSee();

	}

}
