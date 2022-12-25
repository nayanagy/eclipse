package com.xworkz.collection.Dto;

import java.io.Serializable;

public class SanitizerDTO implements Serializable {

	private String brand;
	private int id;
	private Double price;
	private String color;

	public SanitizerDTO() {
		super();
	}

	public SanitizerDTO(String brand, int id, Double price, String color) {
		super();
		this.brand = brand;
		this.id = id;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [brand=" + brand + ", id=" + id + ", price=" + price + ", color=" + color + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
