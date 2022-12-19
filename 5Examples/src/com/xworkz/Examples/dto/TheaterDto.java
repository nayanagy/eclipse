package com.xworkz.Examples.dto;

import com.xworkz.Examples.dto.AbstractAuditDTO;

public class TheaterDto extends AbstractAuditDTO {
	private int id;
	private String name;
	private String brand;
	private String seats;

	public TheaterDto() {
		System.out.println("default const of TheaterDto");
	}

	public TheaterDto(int id, String name, String brand, String seats) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheaterDto [id=" + id + ", name=" + name + ", brand=" + brand + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

}
