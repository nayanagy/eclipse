package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.Dto.AirportDto;

public class AirportDtoRunner {

	public static void main(String[] args) {
		AirportDto airportDto1 = new AirportDto("HAL", "Banglore", 30);
		AirportDto airportDto2 = new AirportDto("Kempegowda International Airport", "Banglore", 40);
		AirportDto airportDto3 = new AirportDto("Indira Gandhi International Airport ", "Delhi", 60);
		AirportDto airportDto4 = new AirportDto("Rajiv Gandhi International Airport", "Hyderabad", 50);
		AirportDto airportDto5 = new AirportDto("HAL", "Hubballi", 30);

		boolean equals = airportDto1.equals(airportDto5);
		System.out.println(equals);

		
		boolean equal = airportDto1.equals(airportDto5);
		System.out.println(airportDto1.getName().equals(airportDto5.getName()));
		Collection<AirportDto> airport = new ArrayList<AirportDto>();
		airport.add(airportDto1);
		airport.add(airportDto5);

	}

}
