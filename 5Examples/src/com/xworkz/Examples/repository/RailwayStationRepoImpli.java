package com.xworkz.Examples.repository;

import com.xworkz.Examples.dto.RailwayStationDto;
import com.xworkz.Examples.exception.StorageFullException;

public class RailwayStationRepoImpli implements RailwayStationRepo {
	private RailwayStationDto[] dtos = new RailwayStationDto[5];
	private int currentIndex = 0;

	@Override
	public boolean Save(RailwayStationDto dto) {
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
