package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Sweet {

	public static void main(String[] args) {
		String sweet1 = "Mysore pack";
		String sweet2 = "Peda";
		String sweet3 = "Laddu";
		String sweet4 = "Holige";
		String sweet5 = "Barfi";
		String sweet6 = "Champakali";
		String sweet7 = "Jilebi";
		String sweet8 = "Chacolate cake";
		String sweet9 = "HonyCake";
		String sweet10 = "Badursha";
		String sweet11 = "Jamoon";
		String sweet12 = "Halkova";
		String sweet13 = "Soan Papdi";

		Collection<String> collection = new ArrayList();
		collection.add(sweet1);// passing a ref
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);

		System.out.println(collection.size());

		collection.clear();
		System.out.println("after clear : " + collection.size());

	}

}
