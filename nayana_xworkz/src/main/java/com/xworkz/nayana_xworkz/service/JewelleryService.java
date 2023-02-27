package com.xworkz.nayana_xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.nayana_xworkz.dto.JewelleryDTO;

public interface JewelleryService {
	Set<ConstraintViolation<JewelleryDTO>> validateAndSave(JewelleryDTO dto);

	default JewelleryDTO findById(int id) {
		return null;
	}
}
