package com.xworkz.helmet.boot;

import java.awt.Color;

import com.xworkz.helmet.constant.HelmetType;
import com.xworkz.helmet.constant.color;
import com.xworkz.helmet.dto.HelmetDto;
import com.xworkz.helmet.repository.HelmetRepository;
import com.xworkz.helmet.service.HelmetService;
import com.xworkz.helmet.service.HelmetServiceImpl;

import System.out.HelmetRepositoryImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		HelmetDto helmetDto = new HelmetDto("vega", HelmetType.OFF_ROAD, 700D, color.BLACK);
		HelmetRepository repo = new HelmetRepositoryImpl();
		HelmetService helmetService = new HelmetServiceImpl(repo);

		boolean success = helmetService.validDateAndSave(helmetDto);
		System.out.println("Success " + success);

		System.out.println("===================================");
		HelmetDto helmetDto1 = new HelmetDto(null, HelmetType.OFF_ROAD, 700D, color.BLACK);
		HelmetRepository repo1 = new HelmetRepositoryImpl();
		HelmetService helmetService1 = new HelmetServiceImpl(repo1);

		boolean success1 = helmetService1.validDateAndSave(helmetDto1);
		System.out.println("Success " + success1);

	}

}
