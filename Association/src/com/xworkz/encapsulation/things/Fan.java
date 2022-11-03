package com.xworkz.encapsulation.things;

public class Fan {
	private String company = "usha";
	private String color = "White";
	private int noOfWings = 3;
	private int Buttons = 4;
	private String type = "Celling fan";
	private boolean working = true;
	private String wingColor = "White";
	private boolean rotate = false;
	private int warranty = 2;
	private int guarantee = 1;
	private double currentBill = 300d;
	private boolean charging = false;
	private String companyOwner = "Vinay Rai";

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWings() {
		return noOfWings;
	}

	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}

	public int getButtons() {
		return Buttons;
	}

	public void setButtons(int buttons) {
		Buttons = buttons;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public String getWingColor() {
		return wingColor;
	}

	public void setWingColor(String wingColor) {
		this.wingColor = wingColor;
	}

	public boolean isRotate() {
		return rotate;
	}

	public void setRotate(boolean rotate) {
		this.rotate = rotate;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}

	public double getCurrentBill() {
		return currentBill;
	}

	public void setCurrentBill(double currentBill) {
		this.currentBill = currentBill;
	}

	public boolean isCharging() {
		return charging;
	}

	public void setCharging(boolean charging) {
		this.charging = charging;
	}

	public String getCompanyOwner() {
		return companyOwner;
	}

	public void setCompanyOwner(String companyOwner) {
		this.companyOwner = companyOwner;
	}

}
