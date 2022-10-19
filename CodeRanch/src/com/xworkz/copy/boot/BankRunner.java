package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Bank;

public class BankRunner {

	public static void main(String[] args) {

		String[] nameValues = { "Anusha", "Sahana" };
		int[] ids = { 24, 76 };
		int[] salaries = { 50000, 34000 };
		String[] projectvalues = { "sql", "java" };
		String[] desgnationValues = { "HR", "manager" };
		int[] tnoVlues = { 1, 3 };

		Bank bank = new Bank("SBI", 9449498840l, "onlinesbi@gmail.com", "banglore", 95,nameValues, ids, salaries,
				projectvalues, desgnationValues, tnoVlues);
		bank.display();

	}

}
