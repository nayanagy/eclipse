package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.BakeryDto;
import com.xworkz.Examples.exception.InvalidNameDataException;

public interface BakeryService {
	boolean valiDateAndSave(BakeryDto dto) throws InvalidNameDataException;

}
