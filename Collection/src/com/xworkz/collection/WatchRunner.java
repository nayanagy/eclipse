package com.xworkz.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class WatchRunner {

	public static void main(String[] args) {
		String watch1 = "HMT";
		String watch2 = "Fast";
		String watch3 = "Rolex";
		String watch4 = "Sonata";
		String watch5 = "Fastrack";

		Collection<String> watch = new LinkedList();
		watch.add(watch5);
		watch.add(watch4);
		watch.add(watch3);
		watch.add(watch2);
		watch.add(watch1);

		System.out.println(watch.size());

		for (String element : watch) {
			System.out.println(element);
		}

		System.out.println("==========Iterator=============");

		Iterator<String> ref = watch.iterator();
		while (ref.hasNext()) {
			System.out.println(ref.next());

		}

	}

}
