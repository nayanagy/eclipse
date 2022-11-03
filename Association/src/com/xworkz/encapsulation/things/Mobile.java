package com.xworkz.encapsulation.things;

public class Mobile {
	private String name="Realme3i";
	private String company="Realme";
	private int storage=32;
	private String color="Black";
	private double price=10000d;
	public int ramInGB;
	public boolean faceLock;
	public boolean fingerPrint;
	public boolean internetConnectivity;
	public float length;
	public float weight;
	public int version;
	public boolean working;

	public Mobile(int ramInGB, boolean faceLock, boolean fingerPrint, boolean internetConnectivity, float length,
			float weight, int version, boolean working) {
		super();
		this.ramInGB = ramInGB;
		this.faceLock = faceLock;
		this.fingerPrint = fingerPrint;
		this.internetConnectivity = internetConnectivity;
		this.length = length;
		this.weight = weight;
		this.version = version;
		this.working = working;
	}

	public void setProerties(String name, String company, int storage, String color, double price) {
		this.name = name;
		this.company = company;
		this.storage = storage;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public int getStorage() {
		return storage;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

}
