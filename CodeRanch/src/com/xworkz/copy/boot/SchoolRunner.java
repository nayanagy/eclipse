package com.xworkz.copy.boot;

import com.xworkz.copy.Place;
import com.xworkz.copy.Subjects;
import com.xworkz.copy.thing.School;

public class SchoolRunner {
	int[] employee_id= {1,2};
	int[] salary= {20000,40000};
	String[] commetie= {"CDC","Management"};
	int[] classes= {1,2};
	
	School school =new School("PES", 80, 9876547234l, "PES@gmail.com",Place.Shimoga, employee_id, salary,Subjects.English , commetie, classes);
	
}