import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "forest_table")
@NamedQuery(name = "findByName", query = "select entity from ForestEntity entity  where entity.name='Jakanari reserve forest'" )
@NamedQuery(name = "findByState", query = "select entity from ForestEntity entity  where entity.state='evergreen Sal forests'" )

public class ForestEntity {
	
	@Id
	@Column(name = "f_id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_state")
	private String state;
	@Column(name = "f_area")
	private int area;
	@Column(name = "f_type")
	private String  type;
	
	public ForestEntity(int id, String name, String state, int area, String type) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
		this.area = area;
		this.state = state;
	}

	public ForestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
