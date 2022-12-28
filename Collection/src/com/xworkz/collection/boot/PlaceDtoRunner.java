package com.xworkz.collection.boot;

import com.xworkz.collection.Dto.PlaceDto;

public class PlaceDtoRunner {

	public static void main(String[] args) {
		PlaceDto placeDto1 = new PlaceDto("Jog Falls", 577421, "Shimoga");
		PlaceDto placeDto2 = new PlaceDto("Kundadri", 577411, "Shimoga");
		PlaceDto placeDto3 = new PlaceDto("Agumbe", 577424, "Shimoga");
		PlaceDto placeDto4 = new PlaceDto("Aihole", 587124, "Bagalkot");
		PlaceDto placeDto5 = new PlaceDto("Pattadakal", 587124, "Bagalkot");

		boolean equals = placeDto4.equals(placeDto5);
		System.out.println(equals);

	}

}
