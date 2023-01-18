package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.service.TerroristServiceImplmentation;

public class TerroristRunner {

	public static void main(String[] args) {
		TerroristDTO dto = new TerroristDTO();
		dto.setName("Nishith");
		dto.setAge(22);
	//	dto.setCountry("Pakistan");
	//	dto.setAlive(true);
		//dto.setSpecialization("looty");
		//dto.setOrganization("kyndryl");

		System.out.println(dto);

		TerroristServiceImplmentation service = new TerroristServiceImplmentation();
		service.validateAndSave(dto);

	}

}
