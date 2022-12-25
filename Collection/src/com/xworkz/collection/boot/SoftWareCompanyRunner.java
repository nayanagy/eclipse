package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftWareCompanyRunner {

	public static void main(String[] args) {
		String swCompany1 = "TCS";
		String swCompany2 = "Wipro";
		String swCompany3 = "IBM";
		String swCompany4 = "Infosys";
		String swCompany5 = "Gyansys";
		String swCompany6 = "Eton";
		String swCompany7 = "Axes Tech";
		String swCompany8 = "Integra Techsoft";
		String swCompany9 = "BOSCH";
		String swCompany10 = "Accenture";
		String swCompany11 = "Oracle";
		String swCompany12 = "MicroSoft";
		String swCompany13 = "Robosoft";
		String swCompany14 = "NetServe";
		String swCompany15 = "Mphasis";
		String swCompany16 = "HCL";
		String swCompany17 = "TrySol";
		String swCompany18 = "capgemini";
		String swCompany19 = "betsole";
		String swCompany20 = "brillio";

		Collection<String> swCompanyName = new ArrayList();
		swCompanyName.add(swCompany20);
		swCompanyName.add(swCompany19);
		swCompanyName.add(swCompany18);
		swCompanyName.add(swCompany17);
		swCompanyName.add(swCompany16);
		swCompanyName.add(swCompany15);
		swCompanyName.add(swCompany14);
		swCompanyName.add(swCompany13);
		swCompanyName.add(swCompany12);
		swCompanyName.add(swCompany11);
		swCompanyName.add(swCompany10);
		swCompanyName.add(swCompany9);
		swCompanyName.add(swCompany8);
		swCompanyName.add(swCompany7);
		swCompanyName.add(swCompany6);
		swCompanyName.add(swCompany5);
		swCompanyName.add(swCompany4);
		swCompanyName.add(swCompany3);
		swCompanyName.add(swCompany2);
		swCompanyName.add(swCompany1);

		System.out.println(swCompanyName.size());
		for (String element : swCompanyName) {
			System.out.println(element);
		}

		System.out.println("===============Iterator===================");

		Iterator<String> ref = swCompanyName.iterator();
		while (ref.hasNext()) {
			System.out.println(ref.next());
		}

	}

}
