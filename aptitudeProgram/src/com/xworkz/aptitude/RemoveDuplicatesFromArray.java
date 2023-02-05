package com.xworkz.aptitude;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr = { 10, 8, 10, 6 };
		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				if (arr[i] == arr[j] && arr[i] != -1) {
					arr[i] = -1;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			if (arr[i] != -1) {
				System.out.println(arr[i]);
			}
		}
	}

}
