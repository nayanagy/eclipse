package com.xworkz.encapsulation.things;

public class Notes {
	private String shopName = "SlV";
	private double price = 1000;
	private int quantity = 1;
	private String brand = "classmate";
	private String type = "KingSize";
	private String buyWith = "pen";
	private boolean binding = true;
	private String weight = "30g";
	private boolean water = false;
	private int orderNo = 12345;
	private String orderedBy = "Nishi";
	private String orderedOn = "Nov2";
	private int discount = 10;

	void setProperties(String shopName, double price, int quantity, String brand, String type, String buyWith,
			boolean binding, String weight, boolean water, int orderNo, String orderedBy, String orderedOn,
			int discount) {
		this.shopName = shopName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.buyWith = buyWith;
		this.binding = binding;
		this.weight = weight;
		this.water = water;
		this.orderNo = orderNo;
		this.orderedBy = orderedBy;
		this.orderedOn = orderedOn;
		this.discount = discount;
	}

	public String getShopName() {
		return shopName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getByWith() {
		return buyWith;
	}

	public boolean isBinding() {
		return binding;
	}

	public String getWeight() {
		return weight;
	}

	public boolean isWater() {
		return water;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public String getOrderedBy() {
		return orderedBy;
	}

	public String getOrderedOn() {
		return orderedOn;
	}

	public int getDiscount() {
		return discount;
	}
}
