package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terrorist.dto.TerroristDTO;

public class TerroristServiceImplmentation implements TerroristService {
	public TerroristServiceImplmentation() {
		System.out.println("Created TerroristServiceImplmentation using no-arg constructor");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("executing validateAndSave start");
		System.out.println("Dto passed : " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(c -> System.out.println(c.getMessage()));
			return false;
		}
		return true;
	}

}
