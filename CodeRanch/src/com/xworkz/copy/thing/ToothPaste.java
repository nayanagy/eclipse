package com.xworkz.copy.thing;

public class ToothPaste {
	public String[] name;
	public int[] discount;
	public int[] quantity;
	public String[] typeOfSalts;
	public String[] color;
	public boolean odor;
	public double density;
	public boolean containsWater;
	public String company;
	public char size;
	public double meltingPoint;

	public ToothPaste(String[] name, int[] discount, int[] quantity, String[] typeOfSalts, String[] color, boolean odor,
			double density, boolean containsWater, String company, char size, double meltingPoint) {
		this.name = name;
		this.discount = discount;
		this.quantity = quantity;
		this.typeOfSalts = typeOfSalts;
		this.color = color;
		this.odor = odor;
		this.density = density;
		this.containsWater = containsWater;
		this.company = company;
		this.size = size;
		this.meltingPoint = meltingPoint;

	}

	public void display() {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		for (int i = 0; i < discount.length; i++) {
			System.out.println(discount[i]);
		}

		for (int i = 0; i < quantity.length; i++) {
			System.out.println(quantity[i]);
		}

		for (int i = 0; i < typeOfSalts.length; i++) {
			System.out.println(typeOfSalts[i]);
		}
		
		for(int i=0;i<color.length;i++) {
			System.out.println(color[i]);
		}
		
		System.out.println(this.odor);
		System.out.println(this.density);
		System.out.println(this.containsWater);
		System.out.println(this.company);
		System.out.println(this.size);
		System.out.println(this.meltingPoint);
	}

}
