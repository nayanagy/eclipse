package com.xworkz.copy.association.task;

public class PersonRunner {

	public static void main(String[] args) {
		Country country = new Country("India", "Droupadi Murmuu", 29, "new Delhi");
		State state = new State("Karnataka", 31, "Basavaraj Bommai", "29KA");
		City city = new City("Banglore", 2345, 560068, "Karnataka");
		Location location = new Location(24, "Rjajinagar", city, state, country);
		Address address = new Address(location);
		Company company = new Company("X-workz", "OM", address);
		Job job = new Job(5.0, "SE", 0, company);
		Email copy1 = new Email("Nayanagy.xworkz@gmail.com", "12345@gy", 9765463723L, company);
		Email copy2 = new Email("Anusha@gmail.com", "2345", 8765493l, company);
		Email[] email = { copy1, copy2 };
		Person person = new Person("Anusha", email, job);

		person.showoff();

	}

}
