package com.xworkz.collection;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {

	public static void main(String[] args) {
		Collection<String> currency = new LinkedList();
		currency.add("US Dollar");
		currency.add("Euro");
		currency.add("Pound");
		currency.add("Rupee");
		currency.add("Albanian Lek");
		currency.add("Australian Dollar");
		currency.add("South African Rand");
		currency.add("Danish Krone");
		currency.add("Chinese Yuan");
		currency.add("Swiss Franc");
		currency.add("Russian Ruble");
		currency.add("Brazilian Real");
		currency.add("Japanese Yen");
		currency.add("Turkish Iira");
		currency.add("Mexican Peso");
		currency.add("Swedish Krona");
		currency.add("Brunei Dollar");
		currency.add("Kuwaiti Dinar");
		currency.add("Polish Zloty");
		currency.add("Saudi Riyal");
		currency.add("Venezuelean bolivar");
		currency.add("Indonesian Rupiah");
		currency.add("Thai Baht");
		currency.add("Omani Rial");
		currency.add("Ghanaian Cedi");
		currency.add("Vietnamese dong");

		System.out.println(currency.size());

		currency.clear();
		System.out.println("after clear : " + currency.size());

	}

}
