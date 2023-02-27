package com.xworkz.nayana_xworkz.repository;

import com.xworkz.nayana_xworkz.entity.JewelleryEntity;

public interface JewelleryRepository {
	boolean save(JewelleryEntity entity);

	default JewelleryEntity findById(int id) {
		return null;
	}
}
