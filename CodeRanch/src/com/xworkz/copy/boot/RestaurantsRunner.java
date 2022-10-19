package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Restaurants;

public class RestaurantsRunner {

	public static void main(String[] args) {
		String[] mainCourse = { "roti", "ghee rice", "fried rice" };
		String[] chats = { "pani puri", "french fries", "dahi puri" };
		int[] tableNos = { 1, 2, 3 };
		String[] iceCreams = { "vanila", "chocolate", "butterscotch" };
		String[] soups = { "tomato", "vegetable", "mancho" };
		String[] brevarages = { "tea", "coffe", "lemon tea" };

		Restaurants restaurant = new Restaurants("taj", "banglore", true, "sagar", "Payment.UPI", mainCourse, chats,
				tableNos, iceCreams, soups, brevarages);
		restaurant.print();

	}

}
