package com.xworkz.pizza.service;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDto;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validDateAndSave(PizzaDto dto) {
		System.out.println("Running validDateAndSave " + dto);
		String name = dto.getName();
		String company = dto.getCompany();
		PizzaSize size = dto.getSize();
		double price = dto.getPrice();
		String flavour = dto.getFlavour();
		String type = dto.getType();
		boolean cheese = dto.isCheese();

		boolean validName, validcompany, validsize, validprice, validflavour, validtype, validcheese = false;

		// validation of pizza pizzaname
		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("Valid pizza name : " + name);
			validName = true;
		} else {
			System.err.println(" Invalid pizza name : " + name);
		}

		// validation of pizza company
		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("valid pizza company : " + company);
			validcompany = true;
		} else {
			System.err.println("Invalid pizza company : " + company);
		}

		// validation of pizza size
		if (size != null) {
			System.out.println("valid pizza size : " + size);
			validsize = true;
		} else {
			System.err.println("Invalid pizza size : " + size);
		}

		// validation of price
		if (price >= 50 && price <= 2000) {
			System.out.println("valid pizza price : " + price);
			validprice = true;
		} else {
			System.err.println("Invalid pizza price : " + price);
		}

		// validation of flavour
		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("valid pizza flavour : " + flavour);
			validflavour = true;
		} else {
			System.err.println("Invalid pizza flavour : " + flavour);
		}

		// validation of pizza type
		if (type != null && type == "veg" || type == "non-veg") {
			System.out.println("valid pizza type : " + type);
			validtype = true;
		} else {
			System.err.println("Invalid pizza type : " + type);
		}
		return false;
	}

}
