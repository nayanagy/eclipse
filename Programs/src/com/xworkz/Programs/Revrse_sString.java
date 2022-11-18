package com.xworkz.Programs;

public class Revrse_sString {
	public static void main(String[] args) {
		String str = "Xworkz";
		String nstr = " ";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);// extracts each char
			nstr = ch + nstr;// add each char in front of the existing char
		}
		System.out.println(nstr);
	}
}
