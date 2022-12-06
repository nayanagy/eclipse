package com.xworkz.Programs;

public class Even_or_odd {
	public static void main(String[] args) {
		int num = 74;

		while (num != 0) {
			num = num / 10;

			if (num % 2 == 0) {
				System.out.println(num+"number is even");
			} else {
				System.out.println(num+"number is odd");
			}
		}
	}
}
