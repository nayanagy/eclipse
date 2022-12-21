package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {
		String animal1="Dog";
		String animal2="Cat";
		String animal3="Horse";
		String animal4="Lion";
		String animal5="Tiger";
		String animal6="Bears";
		String animal7="Deer";
		String animal8="Cheetah";
		String animal9="Leopard";
		String animal10="Camel";
		
		Collection<String> animal=new ArrayList();
		
		animal.add(animal10);
		animal.add(animal9);
		animal.add(animal8);
		animal.add(animal7);
		animal.add(animal6);
		animal.add(animal5);
		animal.add(animal4);
		animal.add(animal3);
		animal.add(animal2);
		animal.add(animal1);
		
		System.out.println(animal.size());
		//for each
		for(String element : animal) {
			System.out.println(element);
		}
		
		System.out.println("===========Iterator========");
		Iterator<String> ref=animal.iterator();
		//to avoid ConcurrentModificationException
		while(ref.hasNext()) //true
		{
			String element=ref.next();
			System.out.println(element);
		}

	}

}
