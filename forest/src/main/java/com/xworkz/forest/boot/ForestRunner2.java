
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.source.entity.ForestEntity;

public class ForestRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByState");
		Object obj = query.getSingleResult();
		ForestEntity entity = (ForestEntity)obj;
		System.out.println(entity);
		manager.close();
		
	
		
	}

}
