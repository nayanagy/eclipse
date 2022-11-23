package com.xworkz.copy.Method.things;

public class Vehicle {
	private String name;
	private int wheels;
	private String brand;
	private String color;
	private boolean quality;
	private String fuel;
	private int milage;
	private double price;
	private float height;
	private float width;

	public Vehicle() {
		System.out.println("Default constructor");
	}

	public Vehicle(String name, int wheels, String brand, String color, boolean quality, String fuel, int milage,
			double price, float height, float width) {
		super();
		this.name = name;
		this.wheels = wheels;
		this.brand = brand;
		this.color = color;
		this.quality = quality;
		this.fuel = fuel;
		this.milage = milage;
		this.price = price;
		this.height = height;
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", wheels=" + wheels + ", brand=" + brand + ", color=" + color + ", quality="
				+ quality + ", fuel=" + fuel + ", milage=" + milage + ", price=" + price + ", height=" + height
				+ ", width=" + width + "]";
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in vehicle");
		if (other instanceof Vehicle) {
			System.out.println("other is vehicle,can check the properties");
			Vehicle casting = (Vehicle) other;
			if (this.brand.equals(casting.brand) && this.color.equals(casting.color)) {
				System.out.println("brand and color same");
			}
			return true;

		} else {
			System.out.println("Other is not vehicle, cannot check the properties");
		}
		return false;
	}
}
