package com.xworkz.Examples.boot;

import com.xworkz.Examples.dto.TheaterDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.TheaterRepo;
import com.xworkz.Examples.repository.TheaterRepoImpli;
import com.xworkz.Examples.service.TheaterService;
import com.xworkz.Examples.service.TheaterServiceImpl;

public class TheaterRunner {
	TheaterDto theaterDto;

	public static void main(String[] args) {
		TheaterDto theaterDto = new TheaterDto(2, "Navrang", "pvrwe", "balcony");
		TheaterRepo theaterRepo = new TheaterRepoImpli();
		TheaterService theaterService = new TheaterServiceImpl(theaterRepo);
		try {
			System.out.println("try block");
			theaterService.valiDateAndSave(theaterDto);
		} catch (InvalidNameDataException e) {
			e.printStackTrace();
		}

	}

}
