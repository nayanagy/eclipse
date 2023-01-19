package com.xworkz.soldiers.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldiers.dto.ResortDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO resortDTO) {
		System.out.println("Registering save in MissileRepoImpl");
		System.out.println("dto " + resortDTO);
		return true;
	}

}
