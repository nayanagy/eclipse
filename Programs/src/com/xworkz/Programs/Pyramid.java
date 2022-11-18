package com.xworkz.Programs;

public class Pyramid {
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(" nayana ");
			}

			System.out.println(" ");
		}

		System.out.println(" ----------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(" " + i);
			}

			System.out.println(" ");
		}
		System.out.println(" ---------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {

				System.out.print(j);
			}

			System.out.println(" ");
		}

		System.out.println(" ---------------------");
		int n = 4;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			// printing charecter
			for (int k = 1; k <= i; k++) {
				System.out.print("@");
			}
			System.out.println(" ");

		}

	}
}
