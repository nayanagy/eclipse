package com.xworkz.soldiers.repo;

import com.xworkz.soldiers.dto.SoldiersDTO;

public class SoldiersRepoImpl implements SoldiersRepo {
	public SoldiersRepoImpl() {
		System.out.println("Created SoldiersRepoImpl using no-arg const..");
	}

	@Override
	public boolean Save(SoldiersDTO dto) {
		System.out.println("running save..");
		System.out.println("Dto : " + dto);
		return false;
	}

}
