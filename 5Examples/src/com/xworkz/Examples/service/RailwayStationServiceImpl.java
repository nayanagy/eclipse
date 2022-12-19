package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.RailwayStationDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.RailwayStationRepo;

public class RailwayStationServiceImpl implements RailwayStationService {
	RailwayStationRepo railwayStationRepo;

	public RailwayStationServiceImpl(RailwayStationRepo railwayStationRepo) {
		super();
		this.railwayStationRepo = railwayStationRepo;
	}

	@Override
	public boolean valiDateAndSave(RailwayStationDto dto) throws InvalidNameDataException {
		String name = dto.getName();
		int noOfPlatforms = dto.getNoOfPlatforms();
		String area = dto.getArea();
		double platformTicketPrice = dto.getPlatformTicketPrice();

		boolean validName = false;
		boolean validNoOfPlatforms = false;
		boolean validArea = false;
		boolean validPlatformTicketPrice = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("RailwayStation nmae is valid : " + name);
			validName = true;
		} else {
			System.out.println("RailwayStation nmae is Invalid : " + name);
		}

		if (noOfPlatforms != 0 && noOfPlatforms >= 0) {
			System.out.println("noOfPlatforms is valid : " + noOfPlatforms);
			validNoOfPlatforms = true;
		} else {
			System.out.println("noOfPlatforms is Invalid : " + noOfPlatforms);
		}

		if (area != null && area.length() >= 4 && area.length() <= 20) {
			System.out.println("RailwayStation area is valid : " + area);
			validArea = true;
		} else {
			System.out.println("RailwayStation area is Invalid : " + area);
		}

		if (platformTicketPrice != 0 && platformTicketPrice >= 0) {
			System.out.println("platformTicketPrice is valid : " + platformTicketPrice);
			validPlatformTicketPrice = true;
		} else {
			System.out.println("platformTicketPrice is Invalid : " + platformTicketPrice);
		}

		if (validName && validNoOfPlatforms && validArea && validPlatformTicketPrice) {
			System.out.println("RailwayStation is valid, can save using repo");
			boolean saved = this.railwayStationRepo.Save(dto);
			System.out.println("RailwayStation DTO is saved Sucess : " + saved);
			return saved;
		}
		throw new InvalidNameDataException("check the data you have passed");

	}
}
