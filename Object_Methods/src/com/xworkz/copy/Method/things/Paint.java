package com.xworkz.copy.Method.things;

public class Paint {
	private String brand;
	private double price;
	private float quantityInLitr;
	private String color;
	private String type;
	private String solventWith;
	private boolean quality;
	private boolean finishing;
	private float meltingPoint;
	private float density;
	
	public Paint() {
		System.out.println("default const");
	}
	

	public Paint(String brand, double price, float quantityInLitr, String color, String type, String solventWith,
			boolean quality, boolean finishing, float meltingPoint, float density) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantityInLitr = quantityInLitr;
		this.color = color;
		this.type = type;
		this.solventWith = solventWith;
		this.quality = quality;
		this.finishing = finishing;
		this.meltingPoint = meltingPoint;
		this.density = density;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getQuantityInLitr() {
		return quantityInLitr;
	}

	public void setQuantityInLitr(float quantityInLitr) {
		this.quantityInLitr = quantityInLitr;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSolventWith() {
		return solventWith;
	}

	public void setSolventWith(String solventWith) {
		this.solventWith = solventWith;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isFinishing() {
		return finishing;
	}

	public void setFinishing(boolean finishing) {
		this.finishing = finishing;
	}

	public float getMeltingPoint() {
		return meltingPoint;
	}

	public void setMeltingPoint(float meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public float getDensity() {
		return density;
	}

	public void setDensity(float density) {
		this.density = density;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", price=" + price + ", quantityInLitr=" + quantityInLitr + ", color=" + color
				+ ", type=" + type + ", solventWith=" + solventWith + ", quality=" + quality + ", finishing="
				+ finishing + ", meltingPoint=" + meltingPoint + ", density=" + density + "]";
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in Paint");
		if (other instanceof Paint) {
			System.out.println("other is paint, can check the properties");
			Paint casted = (Paint) other;// casting
			if (this.color.equals(casted.color)) {
				System.out.println("color is same");
				return true;
			}

		} else {
			System.err.println("Other is not cosmetic, cannot check the properties");
		}
		return false;
	}

}
