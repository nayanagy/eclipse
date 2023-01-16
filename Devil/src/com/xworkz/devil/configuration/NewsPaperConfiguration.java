package com.xworkz.devil.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.devil")
public class NewsPaperConfiguration {
	public NewsPaperConfiguration() {
		System.out.println("creating NewsPaperConfiguration");
	}

	@Bean
	public int newsPaperID() {
		System.out.println("registering newsPaperID");
		return 20;
	}
	
	@Bean
	public String newsPaperName() {
		System.out.println("registering newsPaperName");
		return "VijayaVani";
	}
	
	@Bean
	public String newsPaperOwnerName() {
		System.out.println("registering newsPaperOwnerName");
		return "Sankeshwar";
	}
	
	@Bean
	public String newsPaperLanguage() {
		System.out.println("registering newsPaperLanguage");
		return "Kannada";
	}
	
	@Bean
	public double newsPaperPrice() {
		System.out.println("registering newsPaperPrice");
		return 2;
	}
	
	
	

}
