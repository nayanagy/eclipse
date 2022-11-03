package com.xworkz.encapsulation;

import com.xworkz.encapsulation.things.Notes;

public class NotesRunner {

	public static void main(String[] args) {
		Notes notes=new Notes();
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

	}

}
