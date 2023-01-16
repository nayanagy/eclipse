package com.xworkz.devil.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.devil.bean.Snake;
import com.xworkz.devil.configuration.SnakeConfiguration;

public class SnakeRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SnakeConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		Snake refOfSnake = container.getBean(Snake.class);
		System.out.println(refOfSnake);
		
		

	}

}
