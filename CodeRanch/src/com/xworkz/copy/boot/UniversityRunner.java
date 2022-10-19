package com.xworkz.copy.boot;

import com.xworkz.copy.City;
import com.xworkz.copy.thing.University;

public class UniversityRunner {

	public static void main(String[] args) {
		String[] name= {"Nishitha","Anusha"};
		int[] id={25,56};
		int[]salary={45000,5000};
		String[]subject= {"sql","java"};
		String[] commtie= {"divya","deepak"};
		int[] classes= {1,3};
		
		
University uni=new University("vtu",95, 9449498840l,"Nishi@gmail.com",City.Belagavi,name,id,salary,subject, commtie,classes);
uni.display();

	}
}