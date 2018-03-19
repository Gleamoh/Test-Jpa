package com.testjpa.tp4.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class AssuranceVie extends Compte {

	private LocalDate dateFin;

	private double taux;

	/**
	 * Constructor
	 * 
	 */
	public AssuranceVie() {
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
	public AssuranceVie(int id, String numero, double solde, List<Client> clients, List<Operation> operations,
			double taux, LocalDate dateFin) {
		super(id, numero, solde, clients, operations);
		this.taux = taux;
		this.dateFin = dateFin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.testjpa.tp4.entity.Compte#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " " + taux + " " + dateFin.toString();
	}

	/**
	 * Getter
	 * 
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin
	 *            the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
