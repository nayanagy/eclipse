package com.xworkz.Examples.boot;

import com.xworkz.Examples.dto.RailwayStationDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.RailwayStationRepo;
import com.xworkz.Examples.repository.RailwayStationRepoImpli;
import com.xworkz.Examples.service.RailwayStationService;
import com.xworkz.Examples.service.RailwayStationServiceImpl;

public class RailwayStationRunner {
	RailwayStationDto railwayStationDto;

	public static void main(String[] args) {
		RailwayStationDto railwayStationDto = new RailwayStationDto("Mejastic", 20, "Banglore", 10);
		RailwayStationRepo repo = new RailwayStationRepoImpli();
		RailwayStationService railwayStationService = new RailwayStationServiceImpl(repo);
		try {
			System.out.println("try block");
			railwayStationService.valiDateAndSave(railwayStationDto);
		} catch (InvalidNameDataException e) {
			e.printStackTrace();
		}

	}

}
