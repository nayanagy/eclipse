package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public interface IplRepository {
	boolean create(IplDTO dto);

	default int totaldtos() {
		return 10;

	}

}
