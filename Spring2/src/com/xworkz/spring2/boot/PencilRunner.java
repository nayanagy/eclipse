package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.beans.Pencil;
import com.xworkz.spring2.configuration.PencilConfiguration;

public class PencilRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(PencilConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		Pencil refOfPencil = container.getBean(Pencil.class);
		System.out.println(refOfPencil.getColor());
		System.out.println(refOfPencil.getName());
		System.out.println(refOfPencil.getType());
		System.out.println(refOfPencil.getPrice());
		System.out.println(refOfPencil.isSharp());
		System.out.println(refOfPencil.isStolen());

	}

}
