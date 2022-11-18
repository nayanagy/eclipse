package com.xworkz.Programs;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "Remove White Space";
		str = str.replaceAll(" ", "");
		System.out.println("String after removing all the white space: " + str);
	}
}
