/**
 * 
 */
package com.testjpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * titre : String
	 */
	@Column(name = "titre", nullable = false)
	private String titre;

	/**
	 * auteur : String
	 */
	@Column(name = "auteur", nullable = false)
	private String auteur;

	/**
	 * emprunts : List<Emprunt>
	 */
	@ManyToMany(mappedBy="livres")
	private List<Emprunt> emprunts;

	/**
	 * Constructor
	 * 
	 */
	public Livre() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
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

	/**
	 * Getter
	 * 
	 * @return the emprunts
	 */
	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	/**
	 * Setter
	 * 
	 * @param emprunts
	 *            the emprunts to set
	 */
	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

}
