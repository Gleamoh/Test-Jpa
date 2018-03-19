package com.testjpa.tp4.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Kevin M.
 *
 */
@Entity
@Table(name = "client")
public class Client {

	/**
	 * id : int
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/**
	 * nom : String
	 */
	@Column(name = "nom", length = 50, nullable = false)
	private String nom;
	/**
	 * prenom : String
	 */
	@Column(name = "prenom", length = 50, nullable = false)
	private String prenom;

	/** dateNaissance : LocalDate */
	private LocalDate dateNaissance;

	/** adresse : Adresse */
	@Embedded
	private Adresse adresse;

	/** banque : Banque */
	@ManyToOne
	@JoinColumn(name = "id_banque")
	private Banque banque;

	@ManyToMany
	@JoinTable(name = "contrat", joinColumns = @JoinColumn(name = "id_compte", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id"))
	/** comptes : List<Compte> */
	private List<Compte> comptes;

	/**
	 * Constructor
	 * 
	 */
	public Client() {
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param adresse
	 * @param banque
	 * @param comptes
	 */
	public Client(int id, String nom, String prenom, LocalDate dateNaissance, Adresse adresse, Banque banque,
			List<Compte> comptes) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.banque = banque;
		this.comptes = comptes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "n° " + id + " " + prenom + " " + nom;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Setter
	 * 
	 * @param dateNaissance
	 *            the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Getter
	 * 
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Setter
	 * 
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 * 
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * Setter
	 * 
	 * @param banque
	 *            the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * Getter
	 * 
	 * @return the comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Setter
	 * 
	 * @param comptes
	 *            the comptes to set
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

}
