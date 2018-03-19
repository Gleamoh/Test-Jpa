package com.testjpa.tp4.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class Virement extends Operation {

	/** beneficiaire : String */
	private String beneficiaire;

	/**
	 * Constructor
	 * 
	 */
	public Virement() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param date
	 * @param montant
	 * @param motif
	 * @param compte
	 */
	public Virement(int id, LocalDateTime date, Double montant, String motif, Compte compte, String beneficiaire) {
		super(id, date, montant, motif, compte);
		this.beneficiaire = beneficiaire;
	}

	/**
	 * Getter
	 * 
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Setter
	 * 
	 * @param beneficiaire
	 *            the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}
