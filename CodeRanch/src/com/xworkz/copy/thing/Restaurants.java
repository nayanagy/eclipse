package com.xworkz.copy.thing;

public class Restaurants {

	public String name;
	public String address;
	public boolean open;
	public String owner;
	public String Payment;
	public String[] mainCourse;
	public String[] chats;
	public int[] tableNos;
	public String[] soups;
	public String[] icecreams;
	public String[] beverages;

	public Restaurants(String name, String address, boolean open, String owner, String Payment, String[] mainCourse,
			String[] chats, int[] tableNos, String[] soups, String[] icecreams, String[] beverages) {
		this.name = name;
		this.address = address;
		this.open = open;
		this.owner = owner;
		this.Payment = Payment;
		this.mainCourse = mainCourse;
		this.chats = chats;
		this.tableNos = tableNos;
		this.soups = soups;
		this.icecreams = icecreams;
		this.beverages = beverages;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.open);
		System.out.println(this.owner);
		System.out.println(this.Payment);

		for (int i = 0; i < mainCourse.length; i++) {
			System.out.println(mainCourse[i]);
		}

		for (int i = 0; i < chats.length; i++) {
			System.out.println(chats[i]);
		}
		
		for (int i = 0; i < tableNos.length; i++) {
			System.out.println(tableNos[i]);
		}
		
		for (int i = 0; i < soups.length; i++) {
			System.out.println(soups[i]);
		}
		
		for (int i = 0; i < icecreams.length; i++) {
			System.out.println(icecreams[i]);
		}
		
		for (int i = 0; i < beverages.length; i++) {
			System.out.println(beverages[i]);
		}
	}
}
