package com.xworkz.ipl.repository;

import com.xworkz.ipl.customException.IplTeamSizeExceedException;
import com.xworkz.ipl.dto.IplDTO;

public class IplRepositoryImpl implements IplRepository {
	private IplDTO[] iplDtos = new IplDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("Running create of IplDTO" + dto);
		if (this.currentIndex >= this.iplDtos.length) {
			System.out.println("Size exceeded cannot add more iplteam");
			throw new IplTeamSizeExceedException();
		}
		this.iplDtos[this.currentIndex] = dto;
		System.out.println("Saved" + dto + "in index" + this.currentIndex);
		this.currentIndex++;
		return true;
	}

}
