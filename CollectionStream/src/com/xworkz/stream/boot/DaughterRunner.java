package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.stream.Dto.CompanyCEODTO;
import com.xworkz.stream.Dto.DaughterDTO;

public class DaughterRunner {

	public static void main(String[] args) {

		Collection<DaughterDTO> daughterDTOs = new ArrayList<DaughterDTO>();
		daughterDTOs.add(new DaughterDTO("Raksha", 98754274l, 24, false, true));
		daughterDTOs.add(new DaughterDTO("Smruthi", 702754274l, 23, false, true));
		daughterDTOs.add(new DaughterDTO("Anusha", 636442743l, 25, true, true));
		daughterDTOs.add(new DaughterDTO("Nishitha", 93754274l, 22, true, true));
		daughterDTOs.add(new DaughterDTO("Soumya", 98754256l, 23, true, true));

		Collection<CompanyCEODTO> companyCEODTOs = new LinkedList<CompanyCEODTO>();
		companyCEODTOs.add(new CompanyCEODTO("Omkar", "Xworkz", 20, "india", "BE/Btech", true));
		companyCEODTOs.add(new CompanyCEODTO("Hareesha", "TechRef", 14, "india", "BE/Btech/Bcom/Bse", false));
		companyCEODTOs.add(new CompanyCEODTO("Ravi", "First America", 35, "india", "MBA/Mse/Mcom", true));
		companyCEODTOs.add(new CompanyCEODTO("Madhu", "Signiwins", 38, "india", "BE/Msc/Btech/MBA", false));
		companyCEODTOs.add(new CompanyCEODTO("Vinoda", "BNV", 7, "india", "BE/Btech/MCA", true));

		// print detiles of companyCEO Dtos Daathoughter Dto
		System.out.println(System.lineSeparator());
		System.out.println("print detiles of companyCEO Dtos Daathoughter Dto");
		companyCEODTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("Dauthor dtos");
		daughterDTOs.stream().collect(Collectors.toList()).forEach(ele -> System.out.println(ele));

//			print all Daughtor Dto names Of Company Ceos

		System.out.println(System.lineSeparator());
		System.out.println("//	print all Daughtor Dto names Of Company Ceos");
		daughterDTOs.stream().map(ele -> ele.getName()).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

//			Get toatal CompanyDtos where age is Gretherthan 30
		System.out.println(System.lineSeparator());
		System.out.println("	Get toatal CompanyDtos where age is Gretherthan 30");
		companyCEODTOs.stream().filter(ele -> ele.getAge() > 30).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

//			print Below formate from CompanyCetdto  father age 7 doughter age 0

		System.out.println(System.lineSeparator());
		System.out.println("//	print Below formate from CompanyCetdto  father age 7 doughter age ");
		daughterDTOs.stream().filter(ele -> ele.getAge() == 7).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele.getAge() == 0));

	}

}
