package com.testjpa.tp4.standalone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.testjpa.tp4.entity.Adresse;
import com.testjpa.tp4.entity.Banque;
import com.testjpa.tp4.entity.Client;
import com.testjpa.tp4.entity.Compte;
import com.testjpa.tp4.entity.Operation;

public class Launcher {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_banque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		List<Adresse> adresses = new ArrayList<>();
		adresses.add(new Adresse(45, "Edith Lefel", 44000, "Nantes"));
		adresses.add(new Adresse(88, "Jean Moulin", 45000, "Nice"));
		adresses.add(new Adresse(88, "Victor Hugo", 58000, "Orlean"));
		adresses.add(new Adresse(45, "Albert Einsten", 78000, "VENISE"));

		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(0, "CP5465464", 4568.00d, null, null));
		comptes.add(new Compte(0, "CP5000565", 875.95d, null, null));
		comptes.add(new Compte(0, "CP5000785", 12.54d, null, null));
		comptes.add(new Compte(0, "CP5000115", 10000.56d, null, null));

		for (Compte compte : comptes) {
			em.persist(compte);
		}

		// Noomi Rapace à deux comptes courants à la Caisse d'Epargne
		Banque caisseEpargne = new Banque(0, "Caisse d'Epargne", null);

		em.persist(caisseEpargne);

		Adresse adresseNoomiRapace = adresses.get(2);

		List<Compte> comptesNoomiRapace = new ArrayList<>();
		comptesNoomiRapace.add(comptes.get(0));
		comptesNoomiRapace.add(comptes.get(1));

		List<Operation> noomiOperationsList = new ArrayList<>();
		noomiOperationsList.add(new Operation(0, LocalDateTime.now(), 480.00, "Achat Iphone SE", comptes.get(0)));
		noomiOperationsList.add(new Operation(0, LocalDateTime.now(), 100.00, "Boouf", comptes.get(1)));

		em.persist(new Client(0, "Rapace", "Noomi", LocalDate.now(), adresseNoomiRapace, caisseEpargne,
				comptesNoomiRapace));

		// creer une babque avec une liste de client par defaut
		Banque banqueFull = new Banque(0, "La Banque Postale", null);
		em.persist(banqueFull);

		List<Client> clients = new ArrayList<>();
		clients.add(new Client(0, "Jean", "Marc", LocalDate.now(), adresses.get(0), banqueFull, null));
		clients.add(new Client(0, "Denice", "Alice", LocalDate.now(), adresses.get(1), banqueFull, null));
		clients.add(new Client(0, "Denice", "Brice", LocalDate.now(), adresses.get(2), banqueFull, null));
		clients.add(new Client(0, "Lagafe", "Vincent", LocalDate.now(), adresses.get(3), banqueFull, null));

		for (Client client : clients) {
			em.persist(client);
		}

		et.commit();

		em.close();
		emf.close();

	}

}
