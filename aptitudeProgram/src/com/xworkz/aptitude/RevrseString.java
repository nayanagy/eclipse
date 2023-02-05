package com.xworkz.aptitude;

public class RevrseString {

	public static void main(String[] args) {
		String str = "Hello";
		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
	}

}
