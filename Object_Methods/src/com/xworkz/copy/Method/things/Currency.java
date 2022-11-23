package com.xworkz.copy.Method.things;

public class Currency {
	private String type;
	private double convertingPrice;
	private String material;
	private int validity;
	private String acceptableCountries;
	private double makingCost;
	private int totalCurrancy;
	private boolean strong;
	private String countryName;
	private int code;

	public Currency() {
		super();
	}

	public Currency(String type, double convertingPrice, String material, int validity, String acceptableCountries,
			double makingCost, int totalCurrancy, boolean strong, String countryName, int code) {
		super();
		this.type = type;
		this.convertingPrice = convertingPrice;
		this.material = material;
		this.validity = validity;
		this.acceptableCountries = acceptableCountries;
		this.makingCost = makingCost;
		this.totalCurrancy = totalCurrancy;
		this.strong = strong;
		this.countryName = countryName;
		this.code = code;
	}

	

	public String getType() {
		return type;
	}

	public double getConvertingPrice() {
		return convertingPrice;
	}

	public String getMaterial() {
		return material;
	}

	public int getValidity() {
		return validity;
	}

	public String getAcceptableCountries() {
		return acceptableCountries;
	}

	public double getMakingCost() {
		return makingCost;
	}

	public int getTotalCurrancy() {
		return totalCurrancy;
	}

	public boolean isStrong() {
		return strong;
	}

	public String getCountryName() {
		return countryName;
	}

	public int getCode() {
		return code;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setConvertingPrice(double convertingPrice) {
		this.convertingPrice = convertingPrice;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public void setAcceptableCountries(String acceptableCountries) {
		this.acceptableCountries = acceptableCountries;
	}

	public void setMakingCost(double makingCost) {
		this.makingCost = makingCost;
	}

	public void setTotalCurrancy(int totalCurrancy) {
		this.totalCurrancy = totalCurrancy;
	}

	public void setStrong(boolean strong) {
		this.strong = strong;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Currency [type=" + type + ", convertingPrice=" + convertingPrice + ", material=" + material
				+ ", validity=" + validity + ", acceptableCountries=" + acceptableCountries + ", makingCost="
				+ makingCost + ", totalCurrancy=" + totalCurrancy + ", strong=" + strong + ", countryName="
				+ countryName + ", code=" + code + "]";
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in vehicle");
		if (other instanceof Currency) {
			System.out.println("other is vehicle,can check the properties");
			Currency casting = (Currency) other;
			if (this.code == (casting.code) && this.material.equals(casting.material)
					&& this.countryName.equals(casting.countryName)
					&& this.convertingPrice == (casting.convertingPrice)) {
				System.out.println(" selected Properties are same");
			}
			return true;

		} else {
			System.out.println("Other is not Currency, cannot check the properties");
		}
		return false;
	}

}
