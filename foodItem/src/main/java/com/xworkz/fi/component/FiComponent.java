package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/submit")
public class FiComponent {
	public FiComponent() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(@RequestParam String name, @RequestParam String type, @RequestParam int quantity,
			@RequestParam double price) {
		System.out.println("running on send post");
		System.out.println("name: " + name);
		System.out.println("type: " + type);
		System.out.println("quantity: " + quantity);
		System.out.println("price : " + price);
		return "food.jsp";

	}
}
