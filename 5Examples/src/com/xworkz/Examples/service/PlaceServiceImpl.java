package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.PlaceDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.PlaceRepo;

public class PlaceServiceImpl implements PlaceService {
	PlaceRepo placeRepo;

	public PlaceServiceImpl(PlaceRepo placeRepo) {
		super();
		this.placeRepo = placeRepo;
	}

	@Override
	public boolean valiDateAndSave(PlaceDto dto) throws InvalidNameDataException {
		long pin = dto.getPin();
		String oldName = dto.getOldName();
		String newName = dto.getNewName();
		String famousFor = dto.getFamousFor();
		boolean railwayStation = dto.isRailwayStation();

		boolean validPin = false;
		boolean validOldName = false;
		boolean validNewName = false;
		boolean validFamousFor = false;

		if (pin != 0 && pin >= 0) {
			System.out.println("pin is valid : " + pin);
			validPin = true;
		} else {
			System.out.println("pin is Invalid : " + pin);
		}

		if (oldName != null & oldName.length() >= 4 && oldName.length() <= 20) {
			System.out.println("oldName is valid : " + oldName);
			validOldName = true;
		} else {
			System.out.println("oldName is Invalid :" + oldName);
		}

		if (newName != null & newName.length() >= 4 && newName.length() <= 20) {
			System.out.println("newName is valid : " + newName);
			validNewName = true;
		} else {
			System.out.println("newName is Invalid :" + newName);
		}

		if (famousFor != null & famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println("famousFor is valid : " + famousFor);
			validFamousFor = true;
		} else {
			System.out.println("famousFor is Invalid :" + famousFor);
		}

		if (validPin && validOldName && validNewName && validFamousFor) {
			System.out.println("place details valid, can save using repo ");
			boolean saved = this.placeRepo.save(dto);
			System.out.println("place DTO is saved Sucess : " + saved);
			return saved;
		}
		throw new InvalidNameDataException("check the data you have passed");

	}
}
