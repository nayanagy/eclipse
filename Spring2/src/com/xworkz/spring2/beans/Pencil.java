package com.xworkz.spring2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
	private String name;
	
	@Autowired
	@Qualifier("pencilType")
	private String type;
	
	@Autowired
	@Qualifier("pencilPrice")
	private Double price;
	
	@Autowired
	@Qualifier("pencilColor")
	private String color;
	
	@Autowired
	@Qualifier("pencilSharp")
	private boolean sharp;
	
	@Autowired
	@Qualifier("pencilStolen")
	private boolean stolen;

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public Double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public boolean isSharp() {
		return sharp;
	}

	public boolean isStolen() {
		return stolen;
	}

}
