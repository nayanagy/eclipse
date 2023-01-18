package com.xworkz.soldiers.boot;

import com.xworkz.soldiers.dto.SoldiersDTO;
import com.xworkz.soldiers.repo.SoldiersRepo;
import com.xworkz.soldiers.repo.SoldiersRepoImpl;
import com.xworkz.soldiers.service.SoldiersServiceImpl;

public class SoldiersRunner {

	public static void main(String[] args) {
		SoldiersDTO dto = new SoldiersDTO("Shravya", 7, "Topper", "Snap", "Manglore");

		SoldiersServiceImpl service = new SoldiersServiceImpl();
		SoldiersRepo repo = new SoldiersRepoImpl();
		service.setSoldiersRepo(repo);
		service.validateAndSave(dto);

	}

}
