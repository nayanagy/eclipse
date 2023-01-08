package com.xworkz.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class City {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap();
		map.put("Shivamogga", 28.1);
		map.put("Rajasthan", 45.1);
		map.put("Kadur", 24.3);
		map.put("Birur", 25.2);
		map.put("Bhadravathi", 24.1);
		map.put("Belagavi", 31.1);
		map.put("Yadgir", 38.2);
		map.put("Bengaluru", 22.6);
		map.put("Hassan", 27.1);
		map.put("Jammu&kashmir", -25.1);

		System.out.println(map.size());

		if (map.isEmpty()) {
			System.out.println("High temparature ide");
		} else {
			System.out.println("High temp illa");
		}

		Set<String> keys = map.keySet();

		keys.forEach(e -> System.out.println(e));

		System.out.println("======VALUES======");
		Collection<Double> values = map.values();
		values.forEach(v -> System.out.println(v));

		System.out.println("LOOP AS A PAIR");

		System.out.println(map);
		Set<Entry<String, Double>> entries = map.entrySet();

		for (Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
