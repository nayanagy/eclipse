package com.xworkz.copy.thing;

public class Tablet {
	
	public String[] name;
	public String[] ingredients;
	public String[] type;
	public String[] shape;
	public char[] vitamins;
	public double price;
	public double weight;
	public String color;
	public int dosage;
	public int expiryYear;
	public int quantity;
	
	public Tablet(String[] name, String[] ingredients,String[] type,String[] shape,char[] vitamins,double price,
	double weight, String color,int dosage,int expiryYear,int quantity) {
		this.name=name;
		this.ingredients=ingredients;
		this.type=type;
		this.shape=shape;
		this.vitamins=vitamins;
		this.price=price;
		this.weight=weight;
		this.color=color;
		this.dosage=dosage;
		this.expiryYear=expiryYear;
		this.quantity=quantity;
		
	}
	public void display(){
		
		for (int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for (int i = 0; i < ingredients.length; i++)
		{
			System.out.println(ingredients[i]);
		}
		
		for (int i = 0; i < type.length; i++) 
		{
			System.out.println(type[i]);
		}
		
		for (int i = 0; i < shape.length; i++) 
		{
			System.out.println(shape[i]);
		}
		
		for (int i = 0; i < vitamins.length; i++)
		{
			System.out.println(vitamins[i]);
		}

		System.out.println(this.price);
		System.out.println(this.weight);
		System.out.println(this.color);
		System.out.println(this.dosage);
		System.out.println(this.expiryYear);
		System.out.println(this.expiryYear);
		
	
	}
	

}
