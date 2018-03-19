package com.testjpa.tp4.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class LivretA extends Compte {

	/** taux : double */
	private double taux;

	/**
	 * Constructor
	 * 
	 */
	public LivretA() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param numero
	 * @param solde
	 * @param clients
	 * @param operations
	 */
	public LivretA(int id, String numero, double solde, List<Client> clients, List<Operation> operations,
			double taux) {
		super(id, numero, solde, clients, operations);
		this.taux = taux;
	}

	/**
	 * Getter
	 * 
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter
	 * 
	 * @param taux
	 *            the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
}
