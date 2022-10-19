package com.xworkz.copy.boot;

import com.xworkz.copy.thing.LapTop;

public class LapTopRunner {

	public static void main(String[] args) {

		String[] colour = { "silver", "grey", "black" };
		String[] model = { "14dv2014tu", "14-dv2053tu", "14-dv2016tu" };
		String[] OS = { "windows8", "windows10", "windows11" };
		String[] features = { "fullHD", "micro edge display" };
		String[] accessories = { "keyboard protector", "bag", "camera cover" };
		int[] ratings = { 4, 5, 4 };

		LapTop laptop = new LapTop("HP", "8GB", "intel i3", 30125, 15.6, colour, model, OS, features, accessories,
				ratings);
		laptop.display();

	}

}
