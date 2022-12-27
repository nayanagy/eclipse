package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.Dto.SanitizerDTO;

public class SanitizerDTORunner {

	public static void main(String[] args) {
		SanitizerDTO sanitizerDTO1 = new SanitizerDTO("Lifebuoy Hand Sanitizer", 1, 250D, "White");
		SanitizerDTO sanitizerDTO2 = new SanitizerDTO("Dettol", 2, 25D, "White");
		SanitizerDTO sanitizerDTO3 = new SanitizerDTO("Himalaya", 3, 50D, "Red");
		SanitizerDTO sanitizerDTO4 = new SanitizerDTO("Range Pharma", 4, 81D, "White");
		SanitizerDTO sanitizerDTO5 = new SanitizerDTO("Savlon", 5, 23.99D, "White");
		SanitizerDTO sanitizerDTO6 = new SanitizerDTO("Setrlomax", 6, 599D, "Red");
		SanitizerDTO sanitizerDTO7 = new SanitizerDTO("Davis", 7, 50D, "Blue");
		SanitizerDTO sanitizerDTO8 = new SanitizerDTO("Five Star-Star San", 8, 150D, "Blue");
		SanitizerDTO sanitizerDTO9 = new SanitizerDTO("Matra Ayurvedic", 9, 200D, "Green");
		SanitizerDTO sanitizerDTO10 = new SanitizerDTO(null, 10, 430D, null);
		// SanitizerDTO sanitizerDTO11 = new SanitizerDTO(null, 0, null, null);

		Collection<SanitizerDTO> sanitizer = new LinkedList<SanitizerDTO>();
		sanitizer.add(sanitizerDTO10);
		sanitizer.add(sanitizerDTO9);
		sanitizer.add(sanitizerDTO8);
		sanitizer.add(sanitizerDTO7);
		sanitizer.add(sanitizerDTO6);
		sanitizer.add(sanitizerDTO5);
		sanitizer.add(sanitizerDTO4);
		sanitizer.add(sanitizerDTO3);
		sanitizer.add(sanitizerDTO2);
		sanitizer.add(sanitizerDTO1);
		// sanitizer.add(sanitizerDTO11);

		//System.out.println("max val: " + Collections.max(sanitizer, null));
		// for each or iterator
		Iterator<SanitizerDTO> ref = sanitizer.iterator();
		while (ref.hasNext()) {
			SanitizerDTO element = ref.next();
			// System.out.println(element.getBrand());
			if (element.getPrice() > 25D) {
				System.out.println(element.getBrand());
				System.out.println("sanitizsers of price 25 or above : " + element);
			}

		}

		System.out.println("================================");

		Iterator<SanitizerDTO> ref1 = sanitizer.iterator();
		while (ref1.hasNext()) {
			SanitizerDTO element1 = ref1.next();
			if (element1.getBrand() == null || element1.getColor() == null) {
				System.out.println(element1);
			}
		}

		System.out.println("================================");
		Iterator<SanitizerDTO> ref2 = sanitizer.iterator();
		while (ref2.hasNext()) {
			SanitizerDTO element2 = ref2.next();
			if (element2.getColor() == "Blue" || element2.getColor() == "Green") {
				ref2.remove();
				System.out.println("removed elements  " + element2);
			}
		}

		System.out.println("================================");
		Iterator<SanitizerDTO> ref3 = sanitizer.iterator();
		while (ref3.hasNext()) {
			SanitizerDTO element3 = ref3.next();
			if (element3.getPrice() < 25) {
				System.out.println("Sanitizer with least price " + element3);

			}
		}

		System.out.println("================================");
		Iterator<SanitizerDTO> ref4 = sanitizer.iterator();
		while (ref4.hasNext()) {
			SanitizerDTO element4 = ref4.next();
			if (element4.getPrice() > 500) {
				System.out.println(" Sanitizer with max price   " + element4);

			}
		}
		System.out.println("================================");

		Iterator<SanitizerDTO> ref5 = sanitizer.iterator();
		while (ref5.hasNext()) {
			SanitizerDTO element5 = ref5.next();
			if (element5.getPrice() > 400) {
				System.out.println("2nd max priced sanitizer  " + element5);
			}
		}

		System.out.println("================================");

		/*
		 * Iterator<SanitizerDTO> ref6 = sanitizer.iterator(); while (ref6.hasNext()) {
		 * SanitizerDTO element6 = ref6.next();
		 * if(Collections.max(element6.getPrice())){
		 * System.out.println(" max priced sanitizer  " );
		 * 
		 * }
		 */
		// System.out.println(" max priced sanitizer " + Collections.max());

	}
}
