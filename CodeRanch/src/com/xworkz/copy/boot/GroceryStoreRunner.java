package com.xworkz.copy.boot;

import com.xworkz.copy.thing.GroceryStore;

public class GroceryStoreRunner {

	public static void main(String[] args) {
		String[] name = { "DMart", "HappyMart" };
		String[] location = { "vijaynagar", "Rajajinagar" };
		int[] workers_id = { 23, 45, 46 };
		String[] typeOfItems = { "Vegetables", "Dairy Products" };
		String[] facility = { "good" };

		GroceryStore groceryStore = new GroceryStore(name, location, workers_id, typeOfItems, facility, 20000,
				"Venkatesh", 30, true, true, 10);
		groceryStore.display();
	}

}
