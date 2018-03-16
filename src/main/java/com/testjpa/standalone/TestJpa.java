package com.testjpa.standalone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.dialect.identity.GetGeneratedKeysDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.testjpa.entity.Client;
import com.testjpa.entity.Emprunt;

public class TestJpa {

	public static final Logger LOGGER = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {

		// Créer une instance d’entityManagerFactory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		/*
		 * // Créer une instance d’entityManager
		 * 
		 * //Livre livre = entityManager.find(Livre.class, 2);
		 * 
		 * //LOGGER.info(livre.toString());
		 * 
		 * // trouver un livre par son titre
		 * 
		 * //TypedQuery<Livre> typedQuery =
		 * entityManager.createQuery("SELECT l FROM Livre l WHERE titre=:titre",
		 * Livre.class); //typedQuery.setParameter("titre", "Germinal");
		 * 
		 * Livre livre2 = typedQuery.getSingleResult(); // ou livre2 =
		 * typedQuery.getResultList().get(0); //LOGGER.info(livre2.toString());
		 */
		// extraire tous les emprunts et les livres associés
		
		
		findEmpruntsByClient(client);
	}
	
	 static void findEmpruntsEtLivres() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("SELECT e FROM Emprunt e");

		List<Emprunt> emprunts = query.getResultList();
		
		emprunts.stream().forEach(e -> {
			LOGGER.info(e.toString());
			e.getLivres().stream().forEach(l -> LOGGER.info(l.toString()));
		});

		entityManager.close();
		entityManagerFactory.close();
	}

	 static void findEmpruntsByClient(Client client) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("SELECT e FROM Emprunt e WHERE e.client.id = :id");
		query.setParameter("id", client.getId());
		List<Emprunt> emprunts = query.getResultList();
		
		emprunts.stream().forEach(e -> {
			LOGGER.info(e.toString());
			e.getLivres().stream().forEach(l -> LOGGER.info(l.toString()));
		});

		entityManager.close();
		entityManagerFactory.close();
	}
}
