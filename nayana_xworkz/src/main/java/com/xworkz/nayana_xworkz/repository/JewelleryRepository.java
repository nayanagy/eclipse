package com.xworkz.nayana_xworkz.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.nayana_xworkz.entity.JewelleryEntity;

public interface JewelleryRepository {
	boolean save(JewelleryEntity entity);

	default JewelleryEntity findById(int id) {
		return null;
	}

	default List<JewelleryEntity> findByName(String name) {
		return Collections.emptyList();
	}
}
