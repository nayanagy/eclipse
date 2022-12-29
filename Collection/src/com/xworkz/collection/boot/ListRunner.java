package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// add(element)-->Collection
		list.add("N");// 0
		list.add("A");// 1

		// add(index,element)-->List
		list.add(2, "y");// NAY
		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("=============================");

		list.add("y");// 3 NAYY//Allows Duplicate
		System.out.println("After adding duplicate");
		for (String string : list) {
			System.out.println(string);
		}

		list.set(3, "A");// NAYA

		list.add(4, "G");// NAYAG
		System.out.println("=============================");
		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("Element size before remove : " + list.size());

		list.remove(4);// NAYA

		System.out.println("=============================");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("Element size After remove : " + list.size());

		list.add(4, "Y");// NAYAY
		System.out.println("=============================");
		for (String string : list) {
			System.out.println(string);
		}

		// remove(element)-->Collection
		list.remove("Y");// NAYA
		System.out.println("=============================");
		for (String string : list) {
			System.out.println(string);
		}
		list.add("N");
		list.add("A");
		list.add("G");
		System.out.println("=============================");
		for (String string : list) {
			System.out.println(string);
		}

		// set(index,element)-->List
		list.set(6, " ");
		System.out.println("=============================");
		for (String string : list) {
			System.out.println(string);
		}

		// get(index)-->List
		list.get(4);

		System.out.println("index 4  :" + list.get(4));

	}

}
