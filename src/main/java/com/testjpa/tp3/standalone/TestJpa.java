package com.testjpa.tp3.standalone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.testjpa.tp3.dao.jpa.ClientJpaDao;
import com.testjpa.tp3.dao.jpa.JpaDao;
import com.testjpa.tp3.entity.Client;
import com.testjpa.tp3.entity.Emprunt;

public class TestJpa {

	public static final Logger LOGGER = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {
		
		LOGGER.info("###  Tous les emprunts et les livres associés");
		findEmpruntsEtLivres();
		JpaDao<Client> dao = new ClientJpaDao();
		
		LOGGER.info("###  Tous les emprunts et les livres associés pour le client 3");
		Client client = dao.findById(3);
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
