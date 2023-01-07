package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.SpringConfiguration;
import com.xworkz.thing.Application;
import com.xworkz.thing.Area;
import com.xworkz.thing.Bus;
import com.xworkz.thing.Chocolate;
import com.xworkz.thing.City;
import com.xworkz.thing.Cycle;
import com.xworkz.thing.Fish;
import com.xworkz.thing.Girl;
import com.xworkz.thing.God;
import com.xworkz.thing.Mall;
import com.xworkz.thing.Milk;
import com.xworkz.thing.Park;
import com.xworkz.thing.Patient;
import com.xworkz.thing.Road;
import com.xworkz.thing.Temple;

public class ThingRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Bus ref = spring.getBean(Bus.class);
		System.out.println(ref);

		ApplicationContext spring1 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Road ref1 = spring1.getBean(Road.class);
		System.out.println(ref1);

		ApplicationContext spring2 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Cycle ref2 = spring2.getBean(Cycle.class);
		System.out.println(ref2);

		ApplicationContext spring3 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Girl ref3 = spring3.getBean(Girl.class);
		System.out.println(ref3);

		ApplicationContext spring4 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Application ref4 = spring4.getBean(Application.class);
		System.out.println(ref4);

		ApplicationContext spring5 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Area ref5 = spring5.getBean(Area.class);
		System.out.println(ref5);

		ApplicationContext spring6 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Chocolate ref6 = spring6.getBean(Chocolate.class);
		System.out.println(ref6);

		ApplicationContext spring7 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		City ref7 = spring7.getBean(City.class);
		System.out.println(ref7);

		ApplicationContext spring8 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Fish ref8 = spring8.getBean(Fish.class);
		System.out.println(ref8);

		ApplicationContext spring9 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		God ref9 = spring9.getBean(God.class);
		System.out.println(ref9);

		ApplicationContext spring10 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Mall ref10 = spring10.getBean(Mall.class);
		System.out.println(ref10);

		ApplicationContext spring11 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Milk ref11 = spring11.getBean(Milk.class);
		System.out.println(ref11);

		ApplicationContext spring12 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Park ref12 = spring12.getBean(Park.class);
		System.out.println(ref12);

		ApplicationContext spring13 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Patient ref13 = spring13.getBean(Patient.class);
		System.out.println(ref13);

		ApplicationContext spring14 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Temple ref14 = spring14.getBean(Temple.class);
		System.out.println(ref14);

	}

}
