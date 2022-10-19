package com.xworkz.copy.thing;

public class Cloths {

	public String material;
	public double price;
	public String brand;
	public String color;
	public int size ;
	public String type;
	public int[] discount;
	public int[] quantity;
	public String[] gender;
	public String[] shopName;
	public String[] location;

	public Cloths(String material, double price, String brand, String color,int size, String type,
			int[] discount, int[] quantity, String[] gender, String[] shopName, String[] location)
	{
		System.out.println("**********");
		this.material =  material;
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.size =size;
		this.type = type;
		this.discount = discount;
		this.quantity = quantity;
		this.gender = gender;
		this.shopName = shopName;
		this.location = location;
	}

		public void display(){
		System.out.println(this.material);
		System.out.println(this.price);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.size);
		System.out.println(this.type);
		
		

		for (int i = 0; i < discount.length; i++)
		{
			System.out.println(discount[i]);
		}
		
		for (int i = 0; i < quantity.length; i++)
		{
			System.out.println(quantity[i]);
		}
		
		for (int i = 0; i < gender.length; i++) 
		{
			System.out.println(gender[i]);
		}
		
		for (int i = 0; i < shopName.length; i++) 
		{
			System.out.println(shopName[i]);
		}
		
		for (int i = 0; i < location.length; i++)
		{
			System.out.println(location[i]);
		}

	}
}
