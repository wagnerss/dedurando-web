package br.com.dedurando.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TRABALHO");

	public EntityManager getEntityManager() {
			return emf.createEntityManager();
	}

}
