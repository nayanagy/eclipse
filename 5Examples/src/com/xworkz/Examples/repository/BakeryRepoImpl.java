package com.xworkz.Examples.repository;

import com.xworkz.Examples.dto.BakeryDto;
import com.xworkz.Examples.exception.StorageFullException;

public class BakeryRepoImpl implements BakeryRepo {
	private BakeryDto[] dtos = new BakeryDto[5];
	private int currentIndex = 0;

	@Override
	public boolean save(BakeryDto dto) {
		if (this.currentIndex >= this.dtos.length) {
			System.out.println("Storge is full");
			throw new StorageFullException("Storage is exceeded..");
		}
		this.dtos[this.currentIndex] = dto;
		System.out.println("data saved " + dto + " in index" + this.currentIndex);
		this.currentIndex++;
		return true;

	}

}
