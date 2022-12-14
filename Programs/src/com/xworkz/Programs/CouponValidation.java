package com.xworkz.Programs;

import java.util.Scanner;

public class CouponValidation {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String coupon = sc.next();

		String str = coupon.substring(0, 2);
		System.out.println(str);

		String str1 = coupon.substring(2, 6);
		System.out.println(str1);

		String str2 = coupon.substring(6, 9);
		System.out.println(str2);

		int convertString = Integer.parseInt(str1);// using wrapper class
		int convertString1 = Integer.valueOf(str1);
		System.out.println("converting String to int : " + convertString1);
		System.out.println("converting String to int : " + convertString);

		if (coupon.length() == 9 && convertString == 2000 || convertString == 2022) {
			if (str2.charAt(str2.length() - 1) >= 'A' && str2.charAt(str2.length() - 1) >= 'Z') {
				if (str2.charAt(0) >= 'A' && str2.charAt(0) >= 'Z' && str2.charAt(1) >= 'A' && str2.charAt(1) >= 'Z') {
					count++;
				}

			}

		}
		if (count == 0) {
			System.out.println("coupon is invalid.." + coupon);
		} else {
			System.out.println("coupon is valid.." + coupon);
		}

	}

}
