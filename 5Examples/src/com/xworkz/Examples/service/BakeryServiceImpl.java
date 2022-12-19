package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.BakeryDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.BakeryRepo;

public class BakeryServiceImpl implements BakeryService {
	BakeryRepo bakeryRepo;

	public BakeryServiceImpl(BakeryRepo bakeryRepo) {
		super();
		this.bakeryRepo = bakeryRepo;
	}

	@Override
	public boolean valiDateAndSave(BakeryDto dto) throws InvalidNameDataException {
		String name = dto.getName();
		String owner = dto.getOwner();
		long contactNo = dto.getContactNo();
		String location = dto.getLocation();
		String famousFor = dto.getFamousFor();

		boolean validName = false;
		boolean validOwner = false;
		boolean validContactNo = false;
		boolean validLocation = false;
		boolean validFamousFor = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name is valid : " + name);
			validName = true;
		} else {
			System.out.println("name is Invalid : " + name);
		}

		if (owner != null && owner.length() >= 4 && owner.length() <= 20) {
			System.out.println("Owner name is valid : " + owner);
			validOwner = true;
		} else {
			System.out.println("Owner name is Invalid : " + owner);
		}

		if (contactNo != 0 && contactNo >= 0) {
			System.out.println("contactNo is valid : " + contactNo);
			validContactNo = true;
		} else {
			System.out.println("contactNo is Invalid : " + contactNo);
		}

		if (location != null && location.length() >= 4 && location.length() <= 20) {
			System.out.println("location is valid : " + location);
			validLocation = true;
		} else {
			System.out.println("location is Invalid : " + location);
		}

		if (famousFor != null && famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println(" bakery famous is valid : " + famousFor);
			validFamousFor = true;
		} else {
			System.out.println(" bakery famous is Invalid : " + famousFor);
		}

		if (validName && validOwner && validContactNo && validLocation && validFamousFor) {
			System.out.println("bakery details valid, can save using repo ");
			boolean saved = this.bakeryRepo.save(dto);
			System.out.println("bakery DTO is saved Sucess : " + saved);
			return saved;
		}
		throw new InvalidNameDataException("check the data you have passed");

	}

}
