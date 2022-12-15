package com.xworkz.helmet.dto;

import java.time.LocalDateTime;

import com.xworkz.helmet.constant.HelmetType;
import com.xworkz.helmet.constant.color;
import com.xworkz.helmet.dto.AbstractAuditDTO;

public class HelmetDto extends AbstractAuditDTO {
	private String brand;
	private HelmetType type;
	private Double price;// Double is non-primitive
	private color color;

	public HelmetDto() {
		System.out.println("default const of helmetDto");
	}

	public HelmetDto(String brand, HelmetType type, Double price, com.xworkz.helmet.constant.color color) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "HelmetDto [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public color getColor() {
		return color;
	}

	public void setColor(color color) {
		this.color = color;
	}

}
