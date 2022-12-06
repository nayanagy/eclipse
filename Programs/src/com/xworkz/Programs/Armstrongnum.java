package com.xworkz.Programs;

public class Armstrongnum {
	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int p = 0;
		/* function to calculate the sum of individual digits */
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			p = (p) + (rem * rem * rem);
		}
		// condition to check weather the value of P equals to user input or not

		if (temp == p) {
			System.out.println("it is Armstrong no");
		} else {
			System.out.println("it is Armstrong no");
		}
	}

}
