package com.xworkz.Programs;

public class Add {
	// add without using + operator
	static int add(int a, int b) {
		for (int i = 1; i <= b; i++) {
			a++;
		}
		return a;
	}

	public static void main(String[] args) {
		int a = add(10, 20);
		System.out.println(a);
	}

}
