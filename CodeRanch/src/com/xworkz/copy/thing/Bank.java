package com.xworkz.copy.thing;

public class Bank {

	public String name;
	public long phone;
	public String email;
	public String city;
	public int no_employess;
	public String[] employees;
	public int[] employee_id;
	public int[] salary;
	public String[] projects;
	public String[] desgnation;
	public int[] team_no;

	public Bank(String name, long phone, String email, String city,int no_employess, String[] employees,
			int[] employee_id, int[] salary, String[] projects, String[] desgnation, int[] team_no)
	{
		System.out.println("**********");
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.city = city;
		this.no_employess = no_employess;
		this.employees = employees;
		this.employee_id = employee_id;
		this.salary = salary;
		this.projects = projects;
		this.desgnation = desgnation;
		this.team_no = team_no;
	}

		public void display(){
		System.out.println(this.name);
		System.out.println(this.no_employess);
		System.out.println(this.phone);
		System.out.println(this.email);
		System.out.println(this.city);
		
		for (int i = 0; i < employees.length; i++) 
		{

			System.out.println(employees[i]);
		}

		for (int i = 0; i < employee_id.length; i++)
		{
			System.out.println(employee_id[i]);
		}
		
		for (int i = 0; i < salary.length; i++)
		{
			System.out.println(salary[i]);
		}
		for (int i = 0; i < projects.length; i++) 
		{
			System.out.println(projects[i]);
		}
		
		for (int i = 0; i < desgnation.length; i++) 
		{
			System.out.println(desgnation[i]);
		}
		
		for (int i = 0; i < team_no.length; i++)
		{
			System.out.println(team_no[i]);
		}

	}
}
