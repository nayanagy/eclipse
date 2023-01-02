package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.Dto.ApplicationDTO;

public class ApplicationDTORunner {

	public static void main(String[] args) {
		Collection<ApplicationDTO> applicationDTOs=new ArrayList<ApplicationDTO>();
		applicationDTOs.add(new ApplicationDTO("Hospital ", 5.6, true, "google", 2500));
		applicationDTOs.add(new ApplicationDTO("Hotel ", 5.6, true, "facebook", 1500));
		applicationDTOs.add(new ApplicationDTO("Insurence ", 5.6, false, "yahoo", 150));
		applicationDTOs.add(new ApplicationDTO("Enterprice Applications ", 5.6, false, "amezon", 36254));
		applicationDTOs.add(new ApplicationDTO("Web Applications ", 5.6, true, "twitter", 98546));
		applicationDTOs.add(new ApplicationDTO("Mobile Applications ", 5.6, false, "Meta", 2510));
		
		System.out.println("Find All ApplicationDTO which is free and Developed By Google");
//		Find All ApplicationDTO which is free and Developed By Google	
			applicationDTOs.stream().filter(ele -> ele.isFree() && "google".contains(ele.getDevelopedBY()))
					.collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

			// Find all ApplicaionDTo where version greter than 5 and collect only name
			System.out.println(System.lineSeparator());
			System.out.println(" Find all ApplicaionDTo where version greter than 5 and collect only name");
			applicationDTOs.stream().filter(ele -> ele.getVersion() > 5).collect(Collectors.toList())
					.forEach(ele -> System.out.println(ele.getName()));
	}

}
