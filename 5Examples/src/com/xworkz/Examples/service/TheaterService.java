package com.xworkz.Examples.service;

import com.xworkz.Examples.dto.TheaterDto;
import com.xworkz.Examples.exception.InvalidNameDataException;

public interface TheaterService {
	boolean valiDateAndSave(TheaterDto dto) throws InvalidNameDataException;

}
