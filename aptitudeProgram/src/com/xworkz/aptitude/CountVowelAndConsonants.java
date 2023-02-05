package com.xworkz.aptitude;

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		String str = "xworkz rajajinagar";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' | ch == 'u') {
				count++;

			} // else {
				// System.out.println("Consonants :"+count);
				// }
		}
		//System.out.println(str.length());
		System.out.println("vowel :" + count);
		//int result =str.length()- count;
		//System.out.println("consonents :" + result);
	}

}
