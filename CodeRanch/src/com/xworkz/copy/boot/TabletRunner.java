package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Tablet;

public class TabletRunner {

	public static void main(String[] args) {
		String[] name = { "Dolo650", "paracetamol" };
		String[] ingredients = { "lactose", "dextrin", "glucose", "sucrose" };
		String[] type = { "Chewable Tablets", "Compressed tablets" };
		String[] shape = { "Round", "square" };
		char[] vitamins = { 'A', 'C' };

		Tablet tablet=new Tablet(name,ingredients,type, shape, vitamins, 250d, 23d, "white", 100, 2023, 2);
		tablet.display();
	}

}
