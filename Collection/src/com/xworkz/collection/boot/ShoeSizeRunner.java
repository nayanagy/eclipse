package com.xworkz.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class ShoeSizeRunner {

	public static void main(String[] args) {
		int shoe1 = 4;
		int shoe2 = 5;
		int shoe3 = 6;
		int shoe4 = 7;
		int shoe5 = 8;
		int shoe6 = 9;
		int shoe7 = 3;
		int shoe8 = 10;
		int shoe9 = 11;
		int shoe10 = 12;
		int shoe11 = 13;
		int shoe12 = 14;
		int shoe13 = 15;
		int shoe14 = 2;
		int shoe15 = 16;

		Collection<Integer> shoes = new TreeSet();
		shoes.add(shoe1);
		shoes.add(shoe2);
		shoes.add(shoe3);
		shoes.add(shoe4);
		shoes.add(shoe5);
		shoes.add(shoe6);
		shoes.add(shoe7);
		shoes.add(shoe8);
		shoes.add(shoe9);
		shoes.add(shoe10);
		shoes.add(shoe11);
		shoes.add(shoe12);
		shoes.add(shoe13);
		shoes.add(shoe14);
		shoes.add(shoe15);

		System.out.println(shoes.size());

		for (Integer element : shoes) {
			System.out.println(element);
		}
		System.out.println("================Iterator================");
		
		Iterator<Integer> ref = shoes.iterator();
		while (ref.hasNext()) {
			System.out.println(ref.next());
		}

	}

}
