package com.xworkz.Examples.boot;

import com.xworkz.Examples.dto.BakeryDto;
import com.xworkz.Examples.exception.InvalidNameDataException;
import com.xworkz.Examples.repository.BakeryRepo;
import com.xworkz.Examples.repository.BakeryRepoImpl;
import com.xworkz.Examples.service.BakeryService;
import com.xworkz.Examples.service.BakeryServiceImpl;

public class BakeryRunner {
	BakeryDto bakeryDto;

	public static void main(String[] args) {
		BakeryDto bakeryDto = new BakeryDto("Raksha bakery", "Raksha", 9905647383l, "Shivamogga", "Barfi");
		BakeryRepo repo = new BakeryRepoImpl();
		BakeryService service = new BakeryServiceImpl(repo);
		try {
			System.out.println("try block");
			service.valiDateAndSave(bakeryDto);
		} catch (InvalidNameDataException e) {
			e.printStackTrace();
		}

	}

}
