package com.xworkz.devil.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.devil.bean.NewsPaper;
import com.xworkz.devil.configuration.NewsPaperConfiguration;

public class NewsPaperRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		NewsPaper refOfNewsPaper = container.getBean(NewsPaper.class);
		System.out.println(refOfNewsPaper);
		System.out.println(refOfNewsPaper.getId());
		System.out.println(refOfNewsPaper.getLanguage());
		System.out.println(refOfNewsPaper.getName());
		System.out.println(refOfNewsPaper.getOwnerName());
		System.out.println(refOfNewsPaper.getPrice());

	}

}
