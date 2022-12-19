package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.PlaceDto;
import com.xworkz.Examples.exception.InvalidNameDataException;

public interface PlaceService {
	boolean valiDateAndSave(PlaceDto dto) throws InvalidNameDataException;
}
