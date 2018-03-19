package com.testjpa.tp4.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

	/** numero : Integer */
	private Integer numero;

	/** rue : String */
	private String rue;

	/** codePostal : Integer */
	private Integer codePostal;

	/** ville : String */
	private String ville;

	
	/** Constructor
	 * 
	 */
	public Adresse() {
	}

	/** Constructor
	 * @param numero
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(Integer numero, String rue, Integer codePostal, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numero + " " + rue + " " + codePostal + " " + ville;
	}

	/**
	 * Getter
	 * 
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * Setter
	 * 
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * Getter
	 * 
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Setter
	 * 
	 * @param rue
	 *            the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Getter
	 * 
	 * @return the codePostal
	 */
	public Integer getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter
	 * 
	 * @param codePostal
	 *            the codePostal to set
	 */
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter
	 * 
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter
	 * 
	 * @param ville
	 *            the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}
