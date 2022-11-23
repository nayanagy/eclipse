package com.xworkz.Programs;

public class Vowel {
	public static void main(String[] args) {
		String str = "Smurthi Technology";
		char ch;
		int count=0;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("String contain char is vowel:   " + ch);
				count++;
			} else {
				System.out.println("String contain char is consonants:  " + ch);
			}
		}System.out.println("total number of vowels: "+count++);
	}
}
