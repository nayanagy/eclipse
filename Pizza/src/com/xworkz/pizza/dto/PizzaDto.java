package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;

public class PizzaDto extends AbstractAuditDTO {
	private String name;
	private String company;
	private PizzaSize size;//enum
	private String flavour;
	private String type;
	private boolean cheese;
	private double price;

	public PizzaDto() {
		System.out.println("no-argument constructor of PizzaDto");
	}

	public PizzaDto(String name, String company, PizzaSize size, String flavour, String type, boolean cheese,
			double price, String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.company = company;
		this.size = size;
		this.flavour = flavour;
		this.type = type;
		this.cheese = cheese;
		this.price = price;
	}

	@Override
	public String toString() {
		return "PizzaDto [name=" + name + ", company=" + company + ", size=" + size + ", flavour=" + flavour + ", type="
				+ type + ", cheese=" + cheese + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
