package com.xworkz.encapsulation.things;

public class BookShop {
	String ownerName="Viresh";
	Notes notes=new Notes();
	public void display() {
		System.out.println(ownerName);
		if (this.notes != null) {
		System.out.println(notes.getShopName());
		System.out.println(notes.getPrice());
		System.out.println(notes.getQuantity());
		System.out.println(notes.getBrand());
		System.out.println(notes.getOrderedBy());
		System.out.println(notes.getOrderedOn());
		System.out.println(notes.getOrderNo());
		System.out.println(notes.getPrice());
		System.out.println(notes.getQuantity());
		System.out.println(notes.getByWith());
		System.out.println(notes.getWeight());
		System.out.println(notes.isBinding());

		notes.setProperties("Vireshbook house",250d,2,"merit","Long book","Sheets",false,"27g",false,23,"Kavitha","aug20",20);
		System.out.println("after modifying properties");
		System.out.println(notes.getShopName());
		System.out.println(notes.getPrice());
		System.out.println(notes.getQuantity());
		System.out.println(notes.getBrand());
		System.out.println(notes.getOrderedBy());
		System.out.println(notes.getOrderedOn());
		System.out.println(notes.getOrderNo());
		System.out.println(notes.getPrice());
		System.out.println(notes.getQuantity());
		System.out.println(notes.getByWith());
		System.out.println(notes.getWeight());
		System.out.println(notes.isBinding());
		
	}else {
		System.out.println("notes is null");
	}
}
}
