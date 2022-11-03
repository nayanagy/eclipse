package com.xworkz.encapsulation.things;

public class FootWear {
	private String type;
	private String brand;
	private String color;
	private int size;
	private double price;
	private boolean leather;
	private boolean quality;
	private int quantity;
	private boolean onlineAvailable;
	private boolean waterProof;
	private int guarantee;
	private String gender;
	private String ShopName;

	 void setFootWears(String type, String brand, String color, int size, double price, boolean leather,
			boolean quality, int quantity, boolean onlineAvailable, boolean waterProof, int guarantee, String gender,
			String shopName) {

		this.type = type;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
		this.leather = leather;
		this.quality = quality;
		this.quantity = quantity;
		this.onlineAvailable = onlineAvailable;
		this.waterProof = waterProof;
		this.guarantee = guarantee;
		this.gender = gender;
		this.ShopName = shopName;
	}

	public String getType() {
		return type;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

	public boolean isLeather() {
		return leather;
	}

	public boolean isQuality() {
		return quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean isOnlineAvailable() {
		return onlineAvailable;
	}

	public boolean isWaterProof() {
		return waterProof;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public String getGender() {
		return gender;
	}

	public String getShopName() {
		return ShopName;
	}

}
