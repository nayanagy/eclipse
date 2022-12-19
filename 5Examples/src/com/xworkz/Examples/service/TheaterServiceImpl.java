package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.TheaterDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.TheaterRepo;

public class TheaterServiceImpl implements TheaterService {
	private TheaterRepo theaterRepo;

	public TheaterServiceImpl(TheaterRepo theaterRepo) {
		super();
		this.theaterRepo = theaterRepo;
	}

	@Override
	public boolean valiDateAndSave(TheaterDto dto) throws InvalidNameDataException {
		int id = dto.getId();
		String name = dto.getName();
		String brand = dto.getBrand();
		String seats = dto.getSeats();

		boolean validId = false;
		boolean validName = false;
		boolean validBrand = false;
		boolean validSeats = false;

		if (id != 0 && id >= 0) {
			System.out.println("Theater id is valid : " + id);
			validId = true;
		} else {
			System.out.println("Theater id is invalid : " + id);
		}

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Theater name is valid : " + name);
			validName = true;
		} else {
			System.out.println("Theater name is Invalid : " + name);
		}

		if (brand != null && brand.length() >= 4 && brand.length() <= 20) {
			System.out.println("Theater brand is valid : " + brand);
			validBrand = true;
		} else {
			System.out.println("Theater brand is Invalid : " + brand);
		}

		if (seats != null && seats.length() >= 4 && seats.length() <= 20) {
			System.out.println("Theater seats is valid : " + seats);
			validSeats = true;
		} else {
			System.out.println("Theater seats is Invalid : " + seats);
		}

		if (validId && validName && validBrand && validSeats) {
			System.out.println("TheaterDto is valid , can save using repo");
			boolean saved = this.theaterRepo.Save(dto);
			System.out.println("Theater DTO is saved Sucess : " + saved);
			return saved;
		}
		throw new InvalidNameDataException("check the data you have passed");

	}

}
