package com.xworkz.stream.Dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {
	private String name;
	private double version;
	private boolean free;
	private String developedBY;
	private double price;

	public ApplicationDTO() {
		super();
	}

	public ApplicationDTO(String name, double version, boolean free, String developedBY, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBY = developedBY;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBY="
				+ developedBY + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevelopedBY() {
		return developedBY;
	}

	public void setDevelopedBY(String developedBY) {
		this.developedBY = developedBY;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
