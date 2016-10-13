package com.bmwmms.factory;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

	private static final EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("simple-service-webapp");
	
	@Produces
	EntityManager createEntityManager() {
		EntityManager entityManager = factory.createEntityManager();
		return entityManager;
	}
	
	public void close(@Disposes EntityManager em) {
		if(em.isOpen()) em.close();
	}
	
	public static EntityManagerFactory getFactory() {
		return factory;
	}
    
}
