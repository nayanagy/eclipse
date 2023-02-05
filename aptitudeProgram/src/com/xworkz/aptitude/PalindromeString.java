package com.xworkz.aptitude;

public class PalindromeString {

	public static void main(String[] args) {
		String str="liril";
		String rev="";
		for (int i = str.length() - 1; i >= 0; i--) {
			
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str + " is not a palindrome");
		}
	}

}
