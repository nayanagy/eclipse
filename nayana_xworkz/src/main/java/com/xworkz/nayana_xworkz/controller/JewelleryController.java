package com.xworkz.nayana_xworkz.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.nayana_xworkz.dto.JewelleryDTO;
import com.xworkz.nayana_xworkz.service.JewelleryService;

@Controller
@RequestMapping("/")
public class JewelleryController {
	
	
	@Autowired
	private JewelleryService jewelleryService;

	private List<String> colors = Arrays.asList("silver", "Black", "White", "gold");

	public JewelleryController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/Jewellery")
	public String onJewellery(Model model) {
		System.out.println("Running onJewellery on get mapping");
		List<String> colors = Arrays.asList("silver", "Black", "White", "gold");
		model.addAttribute("colors", colors);
		return "jewellery";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("Running on search for id "+id);
		JewelleryDTO dto=this.jewelleryService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message","Data not found");
		}
		return "JewellerySearch";
	}

	@PostMapping("/jewellery")
	public String onMicrowave(Model model, JewelleryDTO dto) {
		System.out.println("Running onMicrowave on post mapping" + dto);
		Set<ConstraintViolation<JewelleryDTO>> violations = this.jewelleryService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controler go to success page");
			return "jewellery";
		}
		model.addAttribute("colors", colors);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("Violations in controller");
		return "jewellery";
	}
}
