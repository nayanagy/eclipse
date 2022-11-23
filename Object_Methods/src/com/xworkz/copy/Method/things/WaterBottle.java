package com.xworkz.copy.Method.things;

public class WaterBottle {
	private String brand;
	private String color;
	private float quantityInLitr;
	private double price;
	private float height;
	private float weight;
	private String type;
	private int quantity;
	private String capColor;
	private String shape;

	public WaterBottle() {
		System.out.println("default constructor");
	}

	public WaterBottle(String brand, String color, float quantityInLitr, double price, float height, float weight,
			String type, int quantity, String capColor, String shape) {
		super();
		this.brand = brand;
		this.color = color;
		this.quantityInLitr = quantityInLitr;
		this.price = price;
		this.height = height;
		this.weight = weight;
		this.type = type;
		this.quantity = quantity;
		this.capColor = capColor;
		this.shape = shape;
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

	public float getQuantityInLitr() {
		return quantityInLitr;
	}

	public void setQuantityInLitr(float quantityInLitr) {
		this.quantityInLitr = quantityInLitr;
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

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCapColor() {
		return capColor;
	}

	public void setCapColor(String capColor) {
		this.capColor = capColor;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", color=" + color + ", quantityInLitr=" + quantityInLitr + ", price="
				+ price + ", height=" + height + ", weight=" + weight + ", type=" + type + ", quantity=" + quantity
				+ ", capColor=" + capColor + ", shape=" + shape + "]";
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("Running equals method in Waterbottele");
		if (other instanceof WaterBottle) {
			System.out.println("other is vehicle,can check properties");
			WaterBottle casted = (WaterBottle) other;
			if (this.brand.equals(casted.brand) && this.color.equals(casted.color) && this.price==(casted.price)) {
				System.out.println("brand,color and price same");
				return true;
			} else {
				System.out.println("Properties are not same");
			}
		} else {
			System.err.println("other is not vehicle,cannot check properties");
		}
		return false;
	}

}
