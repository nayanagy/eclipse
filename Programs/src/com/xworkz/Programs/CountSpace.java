package com.xworkz.Programs;

import java.util.Scanner;

public class CountSpace {

	public static void main(String[] args) {
		String str = " Hands on Learning happens here ";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("total number of space : " + count);

		System.out.println("==============================================");
		// remove white space

		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine(), str2 = " ";
		char[] ch1 = str1.toCharArray();
		for (int i = 0; i < str1.length(); i++) {

			if (str1.charAt(i) == ' ') {
				continue;
			} else {
				str2 = str2 + str1.charAt(i);
			}
		}
		System.out.println(str2);

		System.out.println("==============================================");
		String s = "";
		for (char ch2 : str.toCharArray()) {
			if (ch2 == ' ') {
				count += 1;// count=count+1
			} else {
				s += ch2;// s=s+ch;
			}
		}
		System.out.println("white spaces: " + count);
		System.out.println("string without white spaces :" + s);
		
		System.out.println("==============================================");
		
		String nstr = " ";
		for (int i = 19; i < str.length(); i++) {
			char ch = str.charAt(i);// extracts each char
			nstr = ch + nstr;// add each char in front of the existing String
		}
		System.out.println(nstr);
		

	}

}
