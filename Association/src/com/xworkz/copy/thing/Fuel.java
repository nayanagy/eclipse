package com.xworkz.copy.thing;

import com.xworkz.copy.constraints.Location;
import com.xworkz.copy.constraints.Type;

public class Fuel {
	public Brand brand = new Brand("Petrol", 708564, Location.SHIMOGA, 3);
	public boolean special;
	public Type type;
	public double price;
	public double quantity;

	public Fuel(boolean special, Type type, double price, double quantity) {
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public void showOff() {

		System.out.println(this.special);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);

		brand.showOff();

	}

}
