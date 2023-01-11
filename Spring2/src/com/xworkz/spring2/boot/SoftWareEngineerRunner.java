package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.beans.SoftWareEngineer;
import com.xworkz.spring2.configuration.SoftWareEngineerConfiguration;

public class SoftWareEngineerRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SoftWareEngineerConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		SoftWareEngineer refOfSoftWareEngineer = container.getBean(SoftWareEngineer.class);
		System.out.println(refOfSoftWareEngineer.getCompanyName());
		System.out.println(refOfSoftWareEngineer.getExperience());
		System.out.println(refOfSoftWareEngineer.getEngineerName());
		System.out.println(refOfSoftWareEngineer.getSalary());

	}

}
