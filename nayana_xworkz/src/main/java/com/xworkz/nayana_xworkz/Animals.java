package com.xworkz.nayana_xworkz;

public class Animals {

	public static void main(String[] args) {
		String[] animals= {"Shshank","Arun","Neeraj","Uday"};
		int count=0;
		int position=-1;
		for(String animal:animals) {
			for(int i=0;i<animal.length();i++) {
				if(animal.charAt(i)=='k') {
					position=i;
					count++;
				}
			}
		}
		System.out.println(position);
		System.out.println(count);
		

	}

}
