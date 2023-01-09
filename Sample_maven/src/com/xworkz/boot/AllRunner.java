package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.SpringConfiguration;
import com.xworkz.thing.Bag;
import com.xworkz.thing.Bike;
import com.xworkz.thing.Bottle;
import com.xworkz.thing.Fan;
import com.xworkz.thing.Pen;

public class AllRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Bag ref = spring.getBean(Bag.class);
		System.out.println(ref);

		ApplicationContext spring1 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Fan fan = spring1.getBean(Fan.class);
		System.out.println(fan);

		ApplicationContext spring2 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Pen pen = spring2.getBean(Pen.class);
		System.out.println(pen);

		ApplicationContext spring3 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Bike bike = spring3.getBean(Bike.class);
		System.out.println(bike);

		ApplicationContext spring4 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Bottle bottle = spring4.getBean(Bottle.class);
		System.out.println(bottle);

	}

}
