package com.xworkz.Programs;

public class PrimeNumber {
	public static void main(String[] args) {

		int num = 30;
		boolean a = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				a = true;
				break;
			}
		}

		if (!a)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
