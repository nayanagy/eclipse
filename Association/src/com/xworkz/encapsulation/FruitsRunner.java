package com.xworkz.encapsulation;

import com.xworkz.encapsulation.things.Coconut;
import com.xworkz.encapsulation.things.Fruits;
import com.xworkz.encapsulation.things.Mango;
import com.xworkz.encapsulation.things.Strawberry;

public class FruitsRunner {

	public static void main(String[] args) {
		Fruits fruit=new Fruits();
		Strawberry strawberry = new Strawberry();
		Mango mango = new Mango();
		Coconut coconut = new Coconut();
		fruit.display();
		System.out.println("after modifying properties of Strawberry");
		System.out.println(strawberry.getShopName());
		System.out.println(strawberry.getPrice());
		System.out.println(strawberry.getQuantity());
		System.out.println(strawberry.getBrand());
		System.out.println(strawberry.getOrderedBy());
		System.out.println(strawberry.getOrderedOn());
		System.out.println(strawberry.getOrderNo());
		System.out.println(strawberry.getPrice());
		System.out.println(strawberry.getQuantity());
		System.out.println(strawberry.getByWith());
		
		System.out.println("after modifying properties of mango");
		System.out.println(mango.getShopName());
		System.out.println(mango.getPrice());
		System.out.println(mango.getQuantity());
		System.out.println(mango.getBrand());
		System.out.println(mango.getOrderedBy());
		System.out.println(mango.getOrderedOn());
		System.out.println(mango.getOrderNo());
		System.out.println(mango.getPrice());
		System.out.println(mango.getQuantity());
		System.out.println(mango.getByWith());

		System.out.println("after modifying properties of coconut");
		System.out.println(coconut.getShopName());
		System.out.println(coconut.getPrice());
		System.out.println(coconut.getQuantity());
		System.out.println(coconut.getBrand());
		System.out.println(coconut.getOrderedBy());
		System.out.println(coconut.getOrderedOn());
		System.out.println(coconut.getOrderNo());
		System.out.println(coconut.getPrice());
		System.out.println(coconut.getQuantity());
		System.out.println(coconut.getByWith());
	}

}
