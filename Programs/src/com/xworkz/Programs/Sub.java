package com.xworkz.Programs;

public class Sub {
	// sub without using - operator
	static int sub(int a, int b) {
		for (int i = 1; i <= b; i++) {
			a--;
		}
		return a;
	}

	public static void main(String[] args) {
		int a = sub(10, 20);
		System.out.println(a);

	}

}
