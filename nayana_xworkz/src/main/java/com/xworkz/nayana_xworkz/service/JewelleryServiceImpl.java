package com.xworkz.nayana_xworkz.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.nayana_xworkz.dto.JewelleryDTO;
import com.xworkz.nayana_xworkz.entity.JewelleryEntity;
import com.xworkz.nayana_xworkz.repository.JewelleryRepository;

@Service
public class JewelleryServiceImpl implements JewelleryService {

	@Autowired
	private JewelleryRepository jewelleryRepository;

	public JewelleryServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<JewelleryDTO>> validateAndSave(JewelleryDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<JewelleryDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto,can save");
			JewelleryEntity entity = new JewelleryEntity();
			entity.setName(dto.getName());
			entity.setPrice(dto.getPrice());
			entity.setType(dto.getType());
			entity.setColor(dto.getColor());
			entity.setWeight(dto.getWeight());
			boolean saved = this.jewelleryRepository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public JewelleryDTO findById(int id) {
		if (id > 0) {
			JewelleryEntity entity = this.jewelleryRepository.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);
				JewelleryDTO dto = new JewelleryDTO();
				dto.setName(entity.getName());
				dto.setPrice(entity.getPrice());
				dto.setType(entity.getType());
				dto.setColor(entity.getColor());
				dto.setWeight(entity.getWeight());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return JewelleryService.super.findById(id);
	}

}
