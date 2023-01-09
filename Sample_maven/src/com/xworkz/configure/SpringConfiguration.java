package com.xworkz.configure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	@Bean
	public String water() {
		return "Registering water with spring..";
	}

	@Bean("stringBlue")
	public String color() {
		System.out.println("Registering color with spring..");
		String string = new String();
		return string;
	}

	@Bean("stringBlack")
	public String colour() {
		System.out.println("Registering colour with spring..");
		String string = new String();
		return string;
	}

	@Bean
	public String mirror() {
		System.out.println("Registering Mirror with spring..");
		String string = new String();
		return string;
	}

	@Bean
	public String potato() {
		System.out.println("Registering potato with spring..");
		String string = new String();
		return string;
	}

	@Bean
	public Boolean girl() {
		System.out.println("Registering girl with spring.");
		Boolean bool = new Boolean(false);
		return bool;
	}

	@Bean
	public Boolean boy() {
		System.out.println("Registering boy with spring.");
		Boolean bool = new Boolean(false);
		return bool;
	}

	@Bean
	public Boolean good() {
		System.out.println("Registering good with spring.");
		Boolean bool = new Boolean(false);
		return bool;
	}

	@Bean
	public Boolean tasty() {
		System.out.println("Registering tasty with spring.");
		Boolean bool = new Boolean(true);
		return bool;
	}

	@Bean
	public Boolean see() {
		System.out.println("Registering see with spring.");
		Boolean bool = new Boolean(true);
		return bool;
	}

	@Bean
	public Double mrp() {
		System.out.println("Registering mrp with spring.");
		Double doub = new Double(10);
		return doub;
	}

	@Bean
	public Double mobile() {
		System.out.println("Registering mobile with spring.");
		Double doub = new Double(10);
		return doub;
	}

	@Bean
	public Double charger() {
		System.out.println("Registering charger with spring.");
		Double doub = new Double(10);
		return doub;
	}

	@Bean
	public Double book() {
		System.out.println("Registering book with spring.");
		Double doub = new Double(10);
		return doub;
	}

	@Bean
	public Double fan() {
		System.out.println("Registering fan with spring.");
		Double doub = new Double(10);
		return doub;
	}

	@Bean
	public StringBuffer door() {
		System.out.println("regestering door by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuffer light() {
		System.out.println("regestering light by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuffer belt() {
		System.out.println("regestering belt by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuffer brand() {
		System.out.println("regestering brand by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuffer camera() {
		System.out.println("regestering camera by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuilder building() {
		System.out.println("regitering building by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder box() {
		System.out.println("regitering box by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder tops() {
		System.out.println("regitering light by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder wall() {
		System.out.println("regitering wall by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder house() {
		System.out.println("regitering house by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("arrayListValues")
	public ArrayList arrayList() {
		System.out.println("Registered arrayList with spring");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		return (ArrayList) list;
	}

	@Bean("mapCityAndPincodes")
	public Map pincodes() {
		System.out.println("Registered pincodes with spring");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Shimoga", 577225);
		map.put("Mysore", 578620);
		map.put("Durga", 572201);
		map.put("Davangere", 515151);
		map.put("Hosadurga", 577527);
		return map;
	}

}
