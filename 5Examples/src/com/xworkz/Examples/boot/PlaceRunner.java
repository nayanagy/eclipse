package com.xworkz.Examples.boot;

import com.xworkz.Examples.dto.PlaceDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.PlaceRepo;
import com.xworkz.Examples.repository.PlaceRepoImpl;
import com.xworkz.Examples.service.PlaceService;
import com.xworkz.Examples.service.PlaceServiceImpl;

public class PlaceRunner {
	PlaceDto placeDto;

	public static void main(String[] args) {
		PlaceDto placeDto = new PlaceDto(577201, "Mandli", "Shivamogga", "Malnad", true);
		PlaceRepo placeRepo = new PlaceRepoImpl();
		PlaceService placeService = new PlaceServiceImpl(placeRepo);
		try {
			System.out.println("try block");
			placeService.valiDateAndSave(placeDto);
		} catch (InvalidNameDataException e) {
			e.printStackTrace();
		}

	}

}
