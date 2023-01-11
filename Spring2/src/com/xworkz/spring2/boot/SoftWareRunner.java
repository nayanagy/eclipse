package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.beans.SoftWare;
import com.xworkz.spring2.configuration.SoftWareConfiguration;

public class SoftWareRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SoftWareConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		SoftWare refOfSoftWare = container.getBean(SoftWare.class);
		System.out.println(refOfSoftWare);
		System.out.println(refOfSoftWare.getDate());
		System.out.println(refOfSoftWare.getDevloper());
		System.out.println(refOfSoftWare.getName());
		System.out.println(refOfSoftWare.getVersion());
		System.out.println(refOfSoftWare.isFree());

	}

}
