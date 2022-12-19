package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.BuildingDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.BuildingRepo;

public class BuildingServiceImpl implements BuildingService {
	BuildingRepo buildingRepo;

	public BuildingServiceImpl(BuildingRepo buildingRepo) {
		super();
		this.buildingRepo = buildingRepo;
	}

	@Override
	public boolean valiDateAndSave(BuildingDto dto) throws InvalidNameDataException {
		int no = dto.getNo();
		String name = dto.getName();
		int floors = dto.getFloors();
		boolean lift = dto.isLift();
		boolean parking = dto.isParking();
		String type = dto.getType();

		boolean validNo = false;
		boolean validName = false;
		boolean validFloors = false;
		boolean validType = false;

		if (no != 0 && no >= 0) {
			System.out.println("no is valid :" + no);
			validNo = true;
		} else {
			System.out.println("no is Invalid :" + no);
		}

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name is valid : " + name);
			validName = true;
		} else {
			System.out.println("name is Invalid : " + name);
		}

		if (floors != 0 && floors >= 0) {
			System.out.println("floor is valid :" + floors);
			validFloors = true;
		} else {
			System.out.println("floor is Invalid : " + floors);
		}

		if (type != null && type.length() >= 4 && type.length() <= 20) {
			System.out.println("type is valid : " + type);
			validType = true;
		} else {
			System.out.println("type is Invalid : " + type);
		}
		if (validNo && validName && validFloors && validType) {
			System.out.println("building details valid, can save using repo ");
			boolean saved = this.buildingRepo.save(dto);
			System.out.println("building DTO is saved Sucess : " + saved);
			return saved;
		}
		throw new InvalidNameDataException("check the data you have passed");

	}

}
