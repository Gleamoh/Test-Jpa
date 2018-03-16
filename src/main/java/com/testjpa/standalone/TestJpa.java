package com.testjpa.standalone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.testjpa.entity.Livre;

public class TestJpa {

	public static final Logger LOGGER = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {

		// Créer une instance d’entityManagerFactory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Créer une instance d’entityManager

		Livre livre = entityManager.find(Livre.class, 2);

		LOGGER.info(livre.toString());

		// trouver un livre par son titre

		TypedQuery<Livre> typedQuery = entityManager.createQuery("SELECT l FROM Livre l WHERE titre=:titre",
				Livre.class);
		typedQuery.setParameter("titre", "Germinal");

		Livre livre2 = typedQuery.getSingleResult();
		// ou
		livre2 = typedQuery.getResultList().get(0);
		LOGGER.info(livre2.toString());

		entityManager.close();
		entityManagerFactory.close();
	}

}
