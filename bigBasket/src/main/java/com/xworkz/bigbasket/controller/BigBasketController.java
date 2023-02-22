package com.xworkz.bigbasket.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bigbasket.dto.BigBasketDto;
import com.xworkz.bigbasket.service.BigBasketService;


@Controller
@RequestMapping("/bigBasket")
public class BigBasketController {
@Autowired
private BigBasketService bigBasketService;

private List<String> area = Arrays.asList("Rajajinagar", "BTM", "RR Nagar", "Jp nagar","Basveshwar nagar");
private List<String> item = Arrays.asList("Chocolates", "Rose", "Teddy", "I-Phone");

public BigBasketController() {
	System.out.println("Created " + this.getClass().getSimpleName());
}
@GetMapping
public String onValentine(Model model) {
	System.out.println("Running onValentine Get method");
	List<String> area =Arrays.asList("Rajajinagar", "BTM", "RR Nagar", "Jp nagar","Basveshwar nagar");
	List<String> item = Arrays.asList("Chocolates", "Rose", "Teddy", "I-Phone");
	model.addAttribute("area", area);
	model.addAttribute("item", item);
	return "bigBasket";
}

@PostMapping
public String onValentine(Model model, BigBasketDto dto) {
	System.out.println("Running onValentine Post method " + dto);
	Set<ConstraintViolation<BigBasketDto>> violations = this.bigBasketService.validateAndSave(dto);
	if (violations.isEmpty()) {
		System.out.println("No violations in controler go to success page");
		return "bigBasketSuccess";
	}
	model.addAttribute("area", area);
	model.addAttribute("item", item);
	model.addAttribute("errors", violations);
	model.addAttribute("dto", dto);
	System.err.println("violation in controller");
	return "bigBasket";
}

}
