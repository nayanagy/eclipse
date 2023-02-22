package com.xworkz.bigbasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigbasket.dto.BigBasketDto;
import com.xworkz.bigbasket.entity.BigBasketEntity;
import com.xworkz.bigbasket.repository.BigBasketRepository;

@Service
public class BigBasketServiceImpl implements BigBasketService {
	@Autowired
	private BigBasketRepository bigBasketRepository;

	public BigBasketServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigBasketDto>> validateAndSave(BigBasketDto dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BigBasketDto>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto,can save");
			BigBasketEntity entity = new BigBasketEntity();
			entity.setName(dto.getName());
			entity.setEmail(dto.getEmail());
			entity.setPassword(dto.getPassword());
			entity.setArea(dto.getArea());
			entity.setItem(dto.getItem());
			entity.setQuantity(dto.getQuantity());
			entity.setNoOfItems(dto.getNoOfItems());
			entity.setPrice(dto.getPrice());
			entity.setMbl(dto.getMbl());
			entity.setRatings(dto.getRatings());
			entity.setCOD(dto.isCOD());
			boolean saved = this.bigBasketRepository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}

}
