package com.xworkz.helmet.service;

import com.xworkz.helmet.constant.HelmetType;
import com.xworkz.helmet.constant.color;
import com.xworkz.helmet.dto.HelmetDto;
import com.xworkz.helmet.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {
	private HelmetRepository helmetRepository;

	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository = helmetRepository;
	}

	@Override
	public boolean validDateAndSave(HelmetDto dto) {
		String brand = dto.getBrand();
		HelmetType type = dto.getType();
		Double price = dto.getPrice();
		color color = dto.getColor();

		boolean validBrand = false;
		boolean validType = false;
		boolean validPrice = false;
		boolean validColor = false;

		if (brand != null && brand.length() >= 4 && brand.length() <= 10) {
			System.out.println("Helmet brand is valid : " + brand);
			validBrand = true;
		} else {
			System.out.println("Helmet brand is invalid : " + brand);
		}

		if (type != null) {
			System.out.println("Helmet type is valid : " + type);
			validType = true;
		} else {
			System.out.println("Helmet type is invalid : " + type);
		}

		if (price != null && price >= 100 && price < 10000) {
			System.out.println("Helmet price is valid : " + price);
			validPrice = true;
		} else {
			System.out.println("Helmet price is invalid : " + price);
		}

		if (color != null) {
			System.out.println("Helemet is valid : " + color);
			validColor = true;
		} else {
			System.out.println("Helemet is invalid : " + color);
		}

		if (validBrand && validType && validPrice && validColor) {
			System.out.println("HelmetDto is valid , can save using repository");
			boolean saved = this.helmetRepository.Save(dto);
			System.out.println("Helmet DTO is saved : " + saved);
			return saved;
		} else {
			System.out.println("HelmetDto is invalid , can not save using repository");
		}

		return false;

	}

}
