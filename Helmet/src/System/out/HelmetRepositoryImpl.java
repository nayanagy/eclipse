package System.out;

import com.xworkz.helmet.dto.HelmetDto;
import com.xworkz.helmet.repository.HelmetRepository;

public class HelmetRepositoryImpl implements HelmetRepository {

	private HelmetDto[] dtos = new HelmetDto[5];
	private int currectIndex = 0;

	@Override
	public boolean Save(HelmetDto dto) {
		if (this.currectIndex >= this.dtos.length) {
			System.out.println("Storge is full");
			return false;
		}
		this.dtos[this.currectIndex] = dto;
		System.out.println("data saved " + dto + " in index" + this.currectIndex);
		this.currectIndex++;

		return true;
	}

}
