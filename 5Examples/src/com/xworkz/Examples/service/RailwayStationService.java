package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.RailwayStationDto;

import com.xworkz.Examples.exception.InvalidNameDataException;

public interface RailwayStationService {
	boolean valiDateAndSave(RailwayStationDto dto) throws InvalidNameDataException;
}
