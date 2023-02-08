package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/bakery")
public class BakeryController {
	@Autowired
	private BakeryService bakeryService;

	public BakeryController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onBakery(BakeryDTO dto, Model model) {
		System.out.println("Running onBakery " + dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("ownerName", dto.getOwnerName());
		model.addAttribute("ownerWifeName", dto.getOwnerWifeName());
		model.addAttribute("married", dto.isMarried());
		model.addAttribute("famousFor", dto.getFamousFor());
		model.addAttribute("since", dto.getSince());
		boolean saved = this.bakeryService.validateAndSave(dto);
		System.out.println("Saved " + saved);
		return "BakerySaved";
	}
}
