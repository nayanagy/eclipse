package com.xworkz.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pg {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap();
		map.put("kushi_pg", 6200D);
		map.put("Annapurneshwari", 5200D);
		map.put("Ganesha", 4200D);
		map.put("Sai_pg", 5500D);
		map.put("Sri_pg", 5000D);
		map.put("Devi_pg", 5100D);
		map.put("Ravi_pg", 4500D);
		map.put("Kushi_pg_2", 7200D);
		map.put("Durga_pg", 5800D);
		map.put("Durgamba", 6500D);

		System.out.println(map.size());

		if (map.isEmpty()) {
			System.out.println("pg rent jaasthi aytu");
		} else {
			System.out.println("pg rent kammi ide");
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
