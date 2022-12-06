package com.xworkz.Programs;

import java.util.Scanner;

public class CountSpace {

	public static void main(String[] args) {
		String str = " count White Space ";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("total number of space : " + count);

		System.out.println("==============================================");
					//remove white space
		
		
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine(), str2 = " ";
		char[] ch = str1.toCharArray();
		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) == ' ') {
				continue;
			} else {
				str2 = str2 + str1.charAt(i);
			}
		}
		System.out.println(str2);

	}

}
