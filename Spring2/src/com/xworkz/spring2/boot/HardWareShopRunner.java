package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.beans.HardWareShop;
import com.xworkz.spring2.configuration.HardWareShopConfiguration;

public class HardWareShopRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(HardWareShopConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();

		System.out.println(Arrays.toString(beanNames));

		HardWareShop refOfHardWareShop = container.getBean(HardWareShop.class);
		System.out.println(refOfHardWareShop.getId());
		System.out.println(refOfHardWareShop.getName());
		System.out.println(refOfHardWareShop.getOwnerName());
		System.out.println(refOfHardWareShop.getGstNo());
		System.out.println(refOfHardWareShop.getAddress());

	}

}
