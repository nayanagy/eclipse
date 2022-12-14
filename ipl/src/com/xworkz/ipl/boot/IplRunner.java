package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository repo = new IplRepositoryImpl();

		System.out.println("ipl team1");
		IplDTO team1 = new IplDTO();
		team1.setTeamName("csk");
		team1.setCaptainName("Dhoni");
		team1.setOwnerAlive(true);
		team1.setPurse(19);
		team1.setWins(103);
		team1.setCreatedBy("System");
		team1.setCreatedDate(LocalDateTime.now());
		repo.create(team1);

		System.out.println("ipl team2");
		IplDTO team2 = new IplDTO();
		team2.setTeamName("csk");
		team2.setCaptainName("Dhoni");
		team2.setOwnerAlive(true);
		team2.setPurse(19);
		team2.setWins(103);
		team2.setCreatedBy("System");
		team2.setCreatedDate(LocalDateTime.now());
		repo.create(team2);

		System.out.println("ipl team3");
		IplDTO team3 = new IplDTO();
		team3.setTeamName("RCB");
		team3.setCaptainName("Dhoni");
		team3.setOwnerAlive(true);
		team3.setPurse(19);
		team3.setWins(103);
		team3.setCreatedBy("System");
		team3.setCreatedDate(LocalDateTime.now());
		repo.create(team3);

		System.out.println("ipl team4");
		IplDTO team4 = new IplDTO();
		team4.setTeamName("MI");
		team4.setCaptainName("Dhoni");
		team4.setOwnerAlive(true);
		team4.setPurse(19);
		team4.setWins(103);
		team4.setCreatedBy("System");
		team4.setCreatedDate(LocalDateTime.now());
		repo.create(team4);

		System.out.println("ipl team5");
		IplDTO team5 = new IplDTO();
		team5.setTeamName("csk");
		team5.setCaptainName("Dhoni");
		team5.setOwnerAlive(true);
		team5.setPurse(19);
		team5.setWins(103);
		team5.setCreatedBy("System");
		team5.setCreatedDate(LocalDateTime.now());
		repo.create(team5);

		System.out.println("ipl team6");
		IplDTO team6 = new IplDTO();
		team6.setTeamName("csk");
		team6.setCaptainName("Dhoni");
		team6.setOwnerAlive(true);
		team6.setPurse(19);
		team6.setWins(103);
		team6.setCreatedBy("System");
		team6.setCreatedDate(LocalDateTime.now());
		repo.create(team6);

		System.out.println("ipl team7");
		IplDTO team7 = new IplDTO();
		team7.setTeamName("csk");
		team7.setCaptainName("Dhoni");
		team7.setOwnerAlive(true);
		team7.setPurse(19);
		team7.setWins(103);
		team7.setCreatedBy("System");
		team7.setCreatedDate(LocalDateTime.now());
		repo.create(team7);

		System.out.println("ipl team8");
		IplDTO team8 = new IplDTO();
		team8.setTeamName("csk");
		team8.setCaptainName("Dhoni");
		team8.setOwnerAlive(true);
		team8.setPurse(19);
		team8.setWins(103);
		team8.setCreatedBy("System");
		team8.setCreatedDate(LocalDateTime.now());
		repo.create(team8);

		System.out.println("ipl team9");
		IplDTO team9 = new IplDTO();
		team9.setTeamName("csk");
		team9.setCaptainName("Dhoni");
		team9.setOwnerAlive(true);
		team9.setPurse(19);
		team9.setWins(103);
		team9.setCreatedBy("System");
		team9.setCreatedDate(LocalDateTime.now());
		repo.create(team9);

		System.out.println("ipl team10");
		IplDTO team10 = new IplDTO();
		team10.setTeamName("csk");
		team10.setCaptainName("Dhoni");
		team10.setOwnerAlive(true);
		team10.setPurse(19);
		team10.setWins(103);
		team10.setCreatedBy("System");
		team10.setCreatedDate(LocalDateTime.now());
		repo.create(team10);

	}

}
