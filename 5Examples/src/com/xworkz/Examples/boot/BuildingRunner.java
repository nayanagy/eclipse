package com.xworkz.Examples.boot;

import com.xworkz.Examples.dto.BuildingDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.BuildingRepo;
import com.xworkz.Examples.repository.BuildingRepoImpl;
import com.xworkz.Examples.service.BuildingService;
import com.xworkz.Examples.service.BuildingServiceImpl;

public class BuildingRunner {
	BuildingDto buildingDto;

	public static void main(String[] args) {
		BuildingDto buildingDto = new BuildingDto(24, "Xworkz", 1, false, false, "company");
		BuildingRepo repo = new BuildingRepoImpl();
		BuildingService buildingService = new BuildingServiceImpl(repo);
		try {
			System.out.println("try block");
			buildingService.valiDateAndSave(buildingDto);
		} catch (InvalidNameDataException e) {
			e.printStackTrace();
		}

	}

}
