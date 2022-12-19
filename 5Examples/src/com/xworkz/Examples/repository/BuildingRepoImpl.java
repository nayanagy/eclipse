package com.xworkz.Examples.repository;

import com.xworkz.Examples.dto.BuildingDto;
import com.xworkz.Examples.exception.StorageFullException;

public class BuildingRepoImpl implements BuildingRepo {
	private BuildingDto[] dtos = new BuildingDto[5];
	private int currentIndex = 0;

	@Override
	public boolean save(BuildingDto dto) {
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
