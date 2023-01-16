package com.xworkz.devil.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.devil.bean.Engine;
import com.xworkz.devil.configuration.EngineConfiguration;

public class EngineRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(EngineConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionCount());

		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine);

	}

}
