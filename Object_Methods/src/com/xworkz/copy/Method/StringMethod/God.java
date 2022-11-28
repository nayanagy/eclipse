package com.xworkz.copy.Method.StringMethod;

public class God {

	public static void main(String[] args) {

		String s = "I pray for god health";
		String s2 = "also job";

		char ch = s.charAt(3);
		System.out.println(ch);

		int unicode = s.codePointAt(1);
		System.out.println(unicode);

		int result = s.compareTo("I pray for god health");
		System.out.println(result);

		System.out.println(s.contains("do you know"));

		System.out.println("Method returns: " + s.contentEquals("12345"));

		System.out.println(s2.endsWith("t"));

		System.out.println(s.equals(s2));

		byte[] arr = s.getBytes();
		System.out.println(arr);

		System.out.println(s.indexOf('o', 5));

		System.out.println("The size of the String is " + s.length());

		String replaceString = s.replace('a', 'e');
		System.out.println(replaceString);

		String replaceString2 = s.replace("me", "You");
		System.out.println(replaceString2);

		String lc = s.toLowerCase();
		System.out.println(lc);

		String uc = s.toUpperCase();
		System.out.println(uc);

		s = String.valueOf(true);
		s2 = String.valueOf(false);
		System.out.println(s);
		System.out.println(s2);

		String ref = s2.trim();
		System.out.println(ref);
		System.out.println(" ");

		boolean ref2 = s.matches(s); // string method 21
		System.out.println(ref2);
		System.out.println(" ");

	}

}
