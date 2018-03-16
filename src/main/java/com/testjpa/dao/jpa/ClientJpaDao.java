package com.testjpa.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.testjpa.entity.Client;
import com.testjpa.entity.Emprunt;

/**
 * @author Kevin M.
 *
 */
public class ClientJpaDao implements IJpaDao<Client> {

	@Override
	public Client findById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// INNER JOIN FETCH c.emprunts : pour récupérer les emprunts aussi la liste des livres (comme un fetch eager mais ponctuel)
		query = entityManager.createQuery("SELECT c INNER JOIN FETCH c.emprunts FROM Client c WHERE id = :id", Client.class);
		query.setParameter("id", id);
		
		Client client = query.getResultList().get(0);
		
		entityManager.close();
		entityManagerFactory.close();
		return emprunts;
	}

}
