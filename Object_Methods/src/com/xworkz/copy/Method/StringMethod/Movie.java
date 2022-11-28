package com.xworkz.copy.Method.StringMethod;

public class Movie {
	public static void main(String[] args) {
		String movie = "Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println(movie.toUpperCase());
		System.out.println(movie.toLowerCase());
		String[] splits = movie.split(" "); // splitted by space
		for (int ride = 0; ride < splits.length; ride++) {
			System.out.println(splits[ride]);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String[] splitted = movie.split(","); // splitted by ,
		for (int i = 0; i < splitted.length; i++) {
			System.out.println("splitted movie by , " + splitted[i]);
		}

		char[] charecters = movie.toCharArray(); // converted to char
		for (int chars = 0; chars < charecters.length; chars++) {
			System.out.println(charecters[chars]);
		}
		String reverse = new StringBuffer(movie).reverse().toString(); // reversed
		System.out.println("reversed  =" + reverse);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// check the palindrome
		StringBuffer buffer = new StringBuffer(movie);
		buffer.reverse();
		String palindrom = buffer.toString();
		if (movie.equals(palindrom)) {
			System.out.println("movie name is palindrome");
		} else {
			System.out.println("movie is not palindrome");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		char[] chars = movie.toCharArray(); // logic to find digits in given String
		StringBuilder digits = new StringBuilder();
		for (char j : chars) {
			if (Character.isDigit(j)) {
				digits.append(j);
			}
		}
		System.out.println("numbers of digits are =" + digits);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");

		char[] dup = movie.toCharArray(); // to find duplicate numbers
		int count;
		for (int i = 0; i < dup.length; i++) {
			count = 1;
			for (int k = 0; k < dup.length; k++) {
				if (dup[i] == dup[k] && dup[i] != ' ') {
					count++;
					dup[k] = '0';
				}
				if (count > 1 && dup[i] != '0')
					System.out.println("dupicate numbers are =" + dup[k]);

			}

		}
		System.out.println("to find P in movie name");
		String word = "P";
		String repeates[] = movie.split(" ");
		int counts = 0;
		for (int i = 0; i < repeates.length; i++) {
			if (word.equals(repeates[i]))
				counts++;
		}

		System.out.println("The word " + word + " occurs " + counts + " times in the above string");

		System.out.println("ended watching the movie");
	}

}
