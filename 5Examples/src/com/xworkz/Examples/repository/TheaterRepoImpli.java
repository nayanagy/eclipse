package com.xworkz.Examples.repository;

import com.xworkz.Examples.dto.TheaterDto;
import com.xworkz.Examples.exception.StorageFullException;

public class TheaterRepoImpli implements TheaterRepo {
	private TheaterDto[] dtos = new TheaterDto[5];
	private int currentIndex = 0;

	@Override
	public boolean Save(TheaterDto dto) {
		if (this.currentIndex >= this.dtos.length) {
			System.out.println("Storage is full");
			throw new StorageFullException("Storage is exceeded..");
		}
		this.dtos[this.currentIndex] = dto;
		System.out.println("data saved " + dto + " in index" + this.currentIndex);
		this.currentIndex++;

		return true;
	}

}
