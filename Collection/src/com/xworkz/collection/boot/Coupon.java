package com.xworkz.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Coupon {

	public static void main(String[] args) {
		String coupon1 = "2022Dec1";
		String coupon2 = "2022Dec2";
		String coupon3 = "2022Dec3";
		String coupon4 = "2022Dec4";
		String coupon5 = "2022Dec5";
		String coupon6 = "2022Dec6";
		String coupon7 = "2022Dec7";
		String coupon8 = "2022Dec8";
		String coupon9 = "2022Dec9";

		Collection<String> collection = new TreeSet();
		collection.add(coupon1);
		collection.add(coupon2);
		collection.add(coupon3);
		collection.add(coupon4);
		collection.add(coupon5);
		collection.add(coupon6);
		collection.add(coupon7);
		collection.add(coupon8);
		collection.add(coupon9);
		collection.add("2023Jan1");
		collection.add("2023Jan2");
		collection.add("2023Jan14");

		System.out.println(collection.size());
		collection.clear();
		System.out.println("After clear : " + collection.size());

	}

}
