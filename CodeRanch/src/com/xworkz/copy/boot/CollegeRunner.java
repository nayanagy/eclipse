package com.xworkz.copy.boot;

import com.xworkz.copy.thing.College;

public class CollegeRunner {

	public static void main(String[] args) {

		String[] employees = { "sunitha", "Puneeth" };
		int[] employee_id = { 35, 56 };
		int[] salary = { 45000, 5000 };
		String[] subjects = { "sql", "java" };
		String[] desgnationValues = { "HoD", "asst.Professor" };
		int[] team_no = { 1, 3 };

		College college = new College("sunitha", 95, 9449498840l, "sunitha@gmail.com", "banglore", employees,
				employee_id, salary, subjects, desgnationValues, team_no);
		college.display();

	}

}
