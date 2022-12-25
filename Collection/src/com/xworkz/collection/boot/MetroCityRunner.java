package com.xworkz.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MetroCityRunner {

	public static void main(String[] args) {
		String metroCityName1 = "Banglore";
		String metroCityName2 = "Chennai";
		String metroCityName3 = "Hyderabad";
		String metroCityName4 = "Pune";
		String metroCityName5 = "Coimbatore";

		Collection<String> metrocity = new LinkedList();
		metrocity.add(metroCityName1);
		metrocity.add(metroCityName2);
		metrocity.add(metroCityName3);
		metrocity.add(metroCityName4);
		metrocity.add(metroCityName5);

		System.out.println(metrocity.size());

		for (String element : metrocity) {
			System.out.println(element);
		}

		System.out.println("=======================================");
		Iterator<String> ref = metrocity.iterator();
		while (ref.hasNext()) {
			System.out.println(ref.next());
		}

	}

}
