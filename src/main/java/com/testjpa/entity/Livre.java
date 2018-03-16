/**
 * 
 */
package com.testjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kevin M.
 *
 */
@Entity
@Table(name = "livre")
public class Livre {

	/**
	 * id : int
	 */
	@Id
	private int id;

	/**
	 * titre : String
	 */
	private String titre;

	/**
	 * auteur : String
	 */
	private String auteur;

	/**
	 * Constructor
	 * 
	 */
	public Livre() {
		super();
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livre n°" + getId() + " : " + titre + " écrit par " + auteur;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Setter
	 * 
	 * @param titre
	 *            the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * Getter
	 * 
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * Setter
	 * 
	 * @param auteur
	 *            the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}




}
