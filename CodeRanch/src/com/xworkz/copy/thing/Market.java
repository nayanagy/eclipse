package com.xworkz.copy.thing;

public class Market {

	public String name;
	public int noOfShops;
	public long phone;;
	public String email;
	public String city;
	public String[] shops;
	public int[] shopNos;
	public int[] rents;
	public String[] sales;
	public String[] address;
	public int[] team_no;

	public Market(String name, int noOfShops, long phone, String email, String city, String[] shops, int[] shopNos,
			int[] rents, String[] sales, String[] address, int[] team_no) {
		
		this.name = name;
		this.noOfShops = noOfShops;
		this.phone = phone;
		this.email = email;
		this.city = city;
		this.shops = shops;
		this.shopNos = shopNos;
		this.rents = rents;
		this.sales = sales;
		this.address = address;
		this.team_no = team_no;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.noOfShops);
		System.out.println(this.phone);
		System.out.println(this.email);
		System.out.println(this.city);
		for (int i = 0; i < shops.length; i++) {

			System.out.println(shops[i]);
		}

		for (int i = 0; i < shopNos.length; i++) {
			System.out.println(shopNos[i]);
		}
		for (int i = 0; i < rents.length; i++) {
			System.out.println(rents[i]);
		}
		for (int i = 0; i < sales.length; i++) {
			System.out.println(sales[i]);
		}
		for (int i = 0; i < address.length; i++) {
			System.out.println(address[i]);
		}
		for (int i = 0; i < team_no.length; i++) {
			System.out.println(team_no[i]);
		}
	}

}
