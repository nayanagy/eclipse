package com.xworkz.bigbasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bigbasket.dto.BigBasketDto;

public interface BigBasketService {
	Set<ConstraintViolation<BigBasketDto>> validateAndSave(BigBasketDto dto);
}
