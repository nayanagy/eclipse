package com.xworkz.encapsulation.things;

public class FoodOrderApp {
	private String Name = "Zomato";
	private String foodType = "veg";
	private String address = "Rajajinagr";
	private float deliveryhours = 1.30f;
	private float preaperingTime = 1.0f;
	private int deliveryNo = 234;
	private long mblNo = 987654321;
	private boolean quality = true;
	private int quantity = 2;
	private boolean cod = true;
	private boolean offers = false;
	private float discount = 20f;
	private int ratings = 4;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getDeliveryhours() {
		return deliveryhours;
	}

	public void setDeliveryhours(float deliveryhours) {
		this.deliveryhours = deliveryhours;
	}

	public float getPreaperingTime() {
		return preaperingTime;
	}

	public void setPreaperingTime(float preaperingTime) {
		this.preaperingTime = preaperingTime;
	}

	public int getDeliveryNo() {
		return deliveryNo;
	}

	public void setDeliveryNo(int deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public long getMblNo() {
		return mblNo;
	}

	public void setMblNo(long mblNo) {
		this.mblNo = mblNo;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isCod() {
		return cod;
	}

	public void setCod(boolean cod) {
		this.cod = cod;
	}

	public boolean isOffers() {
		return offers;
	}

	public void setOffers(boolean offers) {
		this.offers = offers;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

}
