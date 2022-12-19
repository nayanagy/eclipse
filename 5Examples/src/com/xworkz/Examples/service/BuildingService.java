package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.BuildingDto;
import com.xworkz.Examples.exception.InvalidNameDataException;

public interface BuildingService {
	boolean valiDateAndSave(BuildingDto dto) throws InvalidNameDataException;

}
