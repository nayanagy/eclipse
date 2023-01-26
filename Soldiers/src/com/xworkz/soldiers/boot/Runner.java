package com.xworkz.soldiers.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldiers.configuration.SpringConfiguration;
import com.xworkz.soldiers.dto.FirstAidDTO;
import com.xworkz.soldiers.dto.MissileDTO;
import com.xworkz.soldiers.dto.ResortDTO;
import com.xworkz.soldiers.service.FirstAidService;
import com.xworkz.soldiers.service.MissileService;
import com.xworkz.soldiers.service.ResortService;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = container.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println("saved " + saved);

		System.out.println("================================================");

		MissileService missileservice = container.getBean(MissileService.class);
		boolean save = missileservice.validateAndSave(new MissileDTO());
		System.out.println("saved " + save);

		System.out.println("================================================");
	
		ResortService resortservice = container.getBean(ResortService.class);
		boolean save1 = resortservice.validateAndSave(new ResortDTO());
		System.out.println("saved " + save1);
	}

}
