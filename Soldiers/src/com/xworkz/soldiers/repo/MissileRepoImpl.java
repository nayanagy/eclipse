package com.xworkz.soldiers.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldiers.dto.MissileDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO missileDTO) {
		System.out.println("Registering save in MissileRepoImpl");
		System.out.println("dto " + missileDTO);
		return true;
	}

}
