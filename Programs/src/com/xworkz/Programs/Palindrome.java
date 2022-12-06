package com.xworkz.Programs;

public class Palindrome {

	public static void main(String[] args) {
		int num = 123;
		int reverse = 0;
		int rem;
		int temp = num;

		while (temp != 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}
		if (num == reverse) {
			System.out.println(num + "num is not a palindrome");
		} else {
			System.out.println(num + "num is  palindrome");
		}

	}

}
