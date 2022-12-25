package com.xworkz.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Mall {

	public static void main(String[] args) {
		String mall1 = "Mantri Square Mall";
		String mall2 = "Orion Mall";
		String mall3 = "Lulu Global Mall";
		String mall4 = "Garuda Mall";
		String mall5 = "UB city";
		String mall6 = "GT World Malli";
		String mall7 = "Lido Mall";
		String mall8 = "Nexus Mall Koramangala";
		String mall9 = "City Center";
		String mall10 = "Forum mall";

		Collection<String> collection = new TreeSet();

		collection.add(mall1);
		collection.add(mall2);
		collection.add(mall3);
		collection.add(mall4);
		collection.add(mall5);
		collection.add(mall6);
		collection.add(mall7);
		collection.add(mall8);
		collection.add(mall9);
		collection.add(mall10);
		collection.add("Mall 1");
		collection.add("Mall 2");
		collection.add("Mall 3");
		collection.add("Mall 4");
		collection.add("Mall 5");
		collection.add("Mall 6");
		collection.add("Mall 7");
		collection.add("Mall 8");
		collection.add("Mall 9");
		collection.add("Mall 10");
		collection.add("Mall 11");
		collection.add("Mall 12");
		collection.add("Mall 13");
		collection.add("Mall 14");
		collection.add("Mall 15");
		collection.add("Mall 16");
		collection.add("Mall 17");
		collection.add("Mall 18");
		collection.add("Mall 19");
		collection.add("Mall 20");
		collection.add("Mall 21");
		collection.add("Mall 22");
		collection.add("Mall 23");
		collection.add("Mall 24");
		collection.add("Mall 25");
		collection.add("Mall 26");
		collection.add("Mall 27");
		collection.add("Mall 28");
		collection.add("Mall 29");
		collection.add("Mall 30");

		System.out.println(collection.size());

		collection.clear();

		System.out.println("After clear : " + collection.size());

	}

}
