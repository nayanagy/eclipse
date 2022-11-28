package com.xworkz.Programs;

public class Uppercase {

	public static void main(String[] args) {

		String str = "xyz";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {

				if (j == 0) {
					System.out.print(str.toUpperCase().charAt(i));

				}

				else {

					System.out.print(str.toLowerCase().charAt(i));

				}
			}
		}
	}
}
