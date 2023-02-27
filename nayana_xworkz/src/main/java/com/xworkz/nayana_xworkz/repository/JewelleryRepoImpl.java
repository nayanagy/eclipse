package com.xworkz.nayana_xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.nayana_xworkz.entity.JewelleryEntity;

@Repository
public class JewelleryRepoImpl implements JewelleryRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public JewelleryRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(JewelleryEntity entity) {
		System.out.println("Running save in Repository");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

	@Override
	public JewelleryEntity findById(int id) {
		System.out.println("find by id in repo " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		JewelleryEntity fromDb = entityManager.find(JewelleryEntity.class, id);
		entityManager.close();
		return fromDb;
	}

}
