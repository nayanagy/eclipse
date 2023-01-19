package com.xworkz.soldiers.service;

import com.xworkz.soldiers.dto.FirstAidDTO;

public interface FirstAidService {
	boolean validateAndSave(FirstAidDTO aidDTO);
}
