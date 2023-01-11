package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.beans.Fan;
import com.xworkz.spring2.configuration.FanConfiguration;

public class FanRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(FanConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		Fan refOfFan = container.getBean(Fan.class);
		System.out.println(refOfFan.getFanButtons());
		System.out.println(refOfFan.getFanColor());
		System.out.println(refOfFan.getFanCompany());
		System.out.println(refOfFan.getFanGSTNo());
		System.out.println(refOfFan.getFanName());
		System.out.println(refOfFan.getFanPrice());
		System.out.println(refOfFan.getVolts());
		System.out.println(refOfFan.getWings());

	}

}
