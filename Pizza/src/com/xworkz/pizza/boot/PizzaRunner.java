package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDto;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {
		PizzaDto pizzaDto = new PizzaDto();
		pizzaDto.setName("Golden corn");
		pizzaDto.setCompany("Pizza hut");
		pizzaDto.setSize(PizzaSize.MEDIUM);
		pizzaDto.setCheese(false);
		pizzaDto.setFlavour("Spicy");
		pizzaDto.setType("veg");
		pizzaDto.setPrice(80);
		pizzaDto.setCreatedBy("nayana");
		pizzaDto.setCreatedDate(LocalDateTime.now());

		PizzaService service = new PizzaServiceImpl();
		boolean saved = service.validDateAndSave(pizzaDto);
		System.out.println(saved);

	}

}
