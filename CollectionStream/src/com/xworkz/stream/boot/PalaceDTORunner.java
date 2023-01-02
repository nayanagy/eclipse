package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.Dto.PalaceDTO;

public class PalaceDTORunner {

	public static void main(String[] args) {
		Collection<PalaceDTO> palaceDTOs = new ArrayList<PalaceDTO>();
		palaceDTOs.add(new PalaceDTO("Mysore", "Mysore", "Wadeyar", false, 100D));
		palaceDTOs.add(new PalaceDTO("Bengalore", "Bengalore", "Wadeyar", true, 1000D));
		palaceDTOs.add(new PalaceDTO("Mysore", "Mysore", "Wadeyar", false, 100D));

		palaceDTOs.stream()// loop
				.filter(dto -> dto.isDestroyed())// condition
				.collect(Collectors.toList()).forEach(dto -> System.out.println(dto));

	}

}
