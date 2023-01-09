package com.xworkz.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configure.SpringConfiguration;

public class BeanRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		String refOfString = (String) spring.getBean("water", "stringBlue", "stringBlack", "mirror", "potato",
				String.class);
		System.out.println(refOfString.hashCode());

		Boolean refOfBoolean = (Boolean) spring.getBean("girl", "boy", "good", "see", "tasty", Boolean.class);
		System.out.println(refOfBoolean);

		Double refOfDouble = (Double) spring.getBean("fan", "book", "charger", "mobile", "mrp", Double.class);
		System.out.println(refOfDouble);

		StringBuffer refOfStringBuffer = (StringBuffer) spring.getBean("door", "light", "belt", "brand", "camera",
				StringBuffer.class);
		System.out.println(refOfStringBuffer);

		StringBuilder refOfStringBuilder = (StringBuilder) spring.getBean("house", "wall", "tops", "box", "building",
				StringBuilder.class);
		System.out.println(refOfStringBuilder);

		ArrayList<Integer> string = spring.getBean("arrayListValues", ArrayList.class);
		System.out.println(string.toString());

		Map<String, Integer> strings = spring.getBean("mapCityAndPincodes", Map.class);
		System.out.println(strings.toString());
	}

}
