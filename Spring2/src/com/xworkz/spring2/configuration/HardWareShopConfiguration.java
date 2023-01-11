package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class HardWareShopConfiguration {
	public HardWareShopConfiguration() {
		System.out.println("Created HardWareShopConfiguration");
	}

	@Bean
	public int id() {
		System.out.println("registering id");
		int ref = 15;
		return ref;
	}

	@Bean
	public String shopName() {
		System.out.println("registering shopName");
		String ref = new String("GY Hardwares");
		return ref;
	}

	@Bean
	public String gstNo() {
		System.out.println("registering gstNo");
		String ref = new String("se2345k");
		return ref;
	}

	@Bean
	public String ownerName() {
		System.out.println("registering ownerName");
		String ref = new String("Manoj");
		return ref;
	}

	@Bean
	public String address() {
		System.out.println("registering address");
		String ref = new String("Shimoga");
		return ref;
	}
}
