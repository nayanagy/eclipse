package com.xworkz.soldiers.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldiers.dto.SoldiersDTO;
import com.xworkz.soldiers.repo.SoldiersRepo;

public class SoldiersServiceImpl implements SoldiersService {
	private SoldiersRepo soldiersRepo;

	public SoldiersServiceImpl() {
		System.out.println("creating SoldiersServiceImpl using no-arg constructor..");
	}

	public void setSoldiersRepo(SoldiersRepo soldiersRepo) {
		this.soldiersRepo = soldiersRepo;
	}

	@Override
	public boolean validateAndSave(SoldiersDTO dto) {
		System.out.println("starting validateAndSave..");
		System.out.println("dto passed : " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldiersDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) {
			System.out.println("Error is there");

			violations.forEach(c -> {
				System.out.println("Violating message " + c.getMessage());
			});
			return false;
		} else {
			System.out.println("Data is valid");
			boolean saved = soldiersRepo.Save(dto);
			System.out.println("Dto saved using repo " + saved);
			return saved;
		}
	}

}
