package com.xworkz.stream.boot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.stream.Dto.DataBaseVendorDTO;
import com.xworkz.stream.constant.Type;

public class DataBaseVendorDTORunner {

	public static void main(String[] args) {
		Collection<DataBaseVendorDTO> dataBaseVenderDTOs = new LinkedList<DataBaseVendorDTO>();
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("Enterprice", "Nikil", Type.HIRARCHICAL_DATABASES, 2.5, 150));
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("Home", "Guru", Type.NETWORK_DATABASES, 3.1, 95));
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("Hospital", "Jeevika", Type.NOSQL_DATABASES, 1.2, 56));
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("State", "Omkar", Type.OBJECT_ORIENTED_DATABASES, 5.5, 280));
		dataBaseVenderDTOs.add(new DataBaseVendorDTO("Country", "Hareesha", Type.SQL, 6.1, 75));

//		find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto

			System.out.println(System.lineSeparator());
			System.out.println("find all Databasee venderDTo  Convert DevelopedBy Upper case And Print all Dto");

//		Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl
			System.out.println(System.lineSeparator());
			System.out.println("Find All DataBaseVenderDto where licenceCost less than 100 and Type is SQl");
			dataBaseVenderDTOs.stream().filter(ele -> ele.getLicensecost() < 100 && ele.getType().equals("SQL"))
					.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

	// print all DatabaseVendor Dto Types
			System.out.println(System.lineSeparator());
			System.out.println(" print all DatabaseVendor Dto Types");
			dataBaseVenderDTOs.stream().map(ele -> ele.getType()).collect(Collectors.toList())
					.forEach(ele -> System.out.println(ele));
	}

}
