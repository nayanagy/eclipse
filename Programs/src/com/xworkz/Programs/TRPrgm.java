package com.xworkz.Programs;

import java.util.Scanner;

public class TRPrgm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numStart = sc.nextInt();
		int numEnd = sc.nextInt();
		// System.out.println(numStart);
		// System.out.println(numEnd);

		for (int i = numStart; i <= numEnd; i++) {
			// System.out.println(i);
			int temp = i;
			System.out.println(temp);
			int count = 0;
			for (; temp != 0; temp = temp / 10) {
				count++;
			}
			int n = temp;
			int ref = 0;
			int sum = 0;
			for (; n > 0; n = n / 10) {
				ref = n % 10;
				sum += (int) Math.pow(ref, count);
			}

		}

	}

}
