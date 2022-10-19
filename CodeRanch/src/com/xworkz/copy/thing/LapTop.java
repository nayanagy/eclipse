package com.xworkz.copy.thing;

public class LapTop {
	public String brand;
	public String RAM;
	public String processor;
	public double price;
	public double screenSize;
	public String[] colour;
	public String[] model;
	public String[] OS;
	public String[] features;
	public String accessories[];
	public int rating[];

	public LapTop(String brand, String RAM, String processor, double price, double screenSize, String[] colour,
			String[] model, String[] OS, String[] features, String[] accessories, int[] rating) {
		this.brand = brand;
		this.RAM = RAM;
		this.processor = processor;
		this.price = price;
		this.screenSize = screenSize;
		this.colour = colour;
		this.model = model;
		this.OS = OS;
		this.features = features;
		this.accessories = accessories;
		this.rating = rating;
	}

	public void display() {
		System.out.println(this.brand);
		System.out.println(this.RAM);
		System.out.println(this.processor);
		System.out.println(this.price);
		System.out.println(this.screenSize);
		for (int i = 0; i < colour.length; i++) {
			System.out.println(colour[i]);
		}
		for (int i = 0; i < model.length; i++) {
			System.out.println(model[i]);
		}
		for (int i = 0; i < OS.length; i++) {
			System.out.println(OS[i]);
		}
		for (int i = 0; i < features.length; i++) {
			System.out.println(features[i]);
		}
		for (int i = 0; i < accessories.length; i++) {
			System.out.println(accessories[i]);
		}
		for (int i = 0; i < rating.length; i++) {
			System.out.println(rating[i]);
		}

	}

}
