package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Myntra;

public class MyntraRunner {

	public static void main(String[] args) {

		String[] customers = { "Lalitha", "kavitha", "Rakshitha" };
		String[] address = { "banglore", "mysore", "shimoga" };
		String[] payment = { "COD", "card", "UPI" };
		String[] colours = { "White", "Black", "blue" };
		String[] brand = { "DNMX,", "Lee", "RoadStar" };
		int[] quantity = { 8, 4, 6 };
		Myntra myntra = new Myntra("jeans", 12, 123, "clothing", 200, customers, address, payment, colours, brand,
				quantity);
		myntra.display();

	}

}
