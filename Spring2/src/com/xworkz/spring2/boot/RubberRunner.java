package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.beans.Rubber;
import com.xworkz.spring2.configuration.RubberConfiguration;

public class RubberRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(RubberConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		Rubber refOfRubber = container.getBean(Rubber.class);
		System.out.println(refOfRubber.getColor());
		System.out.println(refOfRubber.getRubberName());
		System.out.println(refOfRubber.getShape());
		System.out.println(refOfRubber.getRubberType());
		System.out.println(refOfRubber.getPrice());
		System.out.println(refOfRubber.getStolen());

	}

}
