package com.testjpa.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.testjpa.entity.Client;

/**
 * @author Kevin M.
 *
 */
public class ClientJpaDao implements JpaDao<Client> {

	@Override
	public Client findById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// INNER JOIN FETCH c.emprunts : pour récupérer les emprunts aussi la
		// liste des livres (comme un fetch eager mais ponctuel)
		Query query = entityManager.createQuery("SELECT c FROM Client c INNER JOIN FETCH c.emprunts WHERE c.id = :id",
				Client.class);
		query.setParameter("id", id);

		Client client = (Client) query.getResultList().get(0);

		entityManager.close();
		entityManagerFactory.close();
		return client;
	}

}
