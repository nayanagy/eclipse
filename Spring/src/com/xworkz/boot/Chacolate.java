package com.xworkz.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Chacolate {

	public static void main(String[] args) {
		Map<String, Double> map=new HashMap();
		map.put("Kaccha_Mango", 50D);
		map.put("Snickers", 15D);
		map.put("Milky_bar", 12D);
		map.put("Kit_kat", 20D);
		map.put("5_Star", 10D);
		map.put("Munch", 10D);
		map.put("Chokki-Chokki", 20D);
		map.put("Gone_mad", 10D);
		map.put("DairyMilk", 100D);
		map.put("Silk", 120D);
		
		
		
		System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("Chocolate price jaasthi aytu");
		}
		else {
			System.out.println("Chocolate price kammi ide");
		}
		
		Set<String> keys=map.keySet();
		
		keys.forEach(e->System.out.println(e));
		
		System.out.println("======VALUES======");
		Collection<Double> values=map.values();
		values.forEach(v->System.out.println(v));
		
		System.out.println("LOOP AS A PAIR");
		
		System.out.println(map);
		Set<Entry<String, Double>> entries = map.entrySet();
		
		for(Entry<String,Double>entry:entries) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		
		
		

	}


	}

}
