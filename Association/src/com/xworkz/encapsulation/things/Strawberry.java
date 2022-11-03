package com.xworkz.encapsulation.things;

public class Strawberry {
	private String shopName="shiva";
	private double price=1000;
	private int quantity=1;
	private String brand="Nestle";
	private String type="salt";
	private String buyWith="chocolate";
	private boolean veg=true;
	private String fat="30g";
	private boolean water=false;
	private int orderNo=12345;
	private String orderedBy="Raksha";
	private String orderedOn="may9";
	private int discount=10;

	 void setProperties(String shopName, double price, int quantity, String brand, String type, String buyWith,boolean veg, String fat, boolean water, int orderNo, String orderedBy, String orderedOn, int discount) {
		this.shopName = shopName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.buyWith = buyWith;
		this.veg = veg;
		this.fat = fat;
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
	public boolean isVeg() {
		return veg;
	}
	public String getFat() {
		return fat;
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

