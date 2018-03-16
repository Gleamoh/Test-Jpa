/**
 * 
 */
package com.testjpa.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
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
@Table(name = "emprunt")
public class Emprunt {

	/**
	 * id : int
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * dateDebut : LocalDateTime
	 */
	@Column(name = "date_debut", nullable = false)
	private LocalDateTime dateDebut;

	/**
	 * delai : int
	 */
	@Column(name = "delai")
	private int delai;

	/**
	 * dateFin : LocalDateTime
	 */
	@Column(name = "date_fin")
	private LocalDateTime dateFin;

	/**
	 * client : Client
	 */
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	/**
	 * livres : List<Livre>
	 */
	@ManyToMany
	@JoinTable(name = "compo", joinColumns = @JoinColumn(name = "id_emprunt", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id"))
	private List<Livre> livres;

	/**
	 * Constructor
	 * 
	 */
	public Emprunt() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Prèt n°" + id + " du " + dateDebut.toString() + " au " + null + " pour le client "
				+ client.toString() + " pour " + delai + " jour(s) ";
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
	 * @return the dateDebut
	 */
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * 
	 * @param dateDebut
	 *            the dateDebut to set
	 */
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter
	 * 
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/**
	 * Setter
	 * 
	 * @param delai
	 *            the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/**
	 * Getter
	 * 
	 * @return the dateFin
	 */
	public LocalDateTime getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * 
	 * @param dateFin
	 *            the dateFin to set
	 */
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter
	 * 
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Setter
	 * 
	 * @param client
	 *            the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Getter
	 * 
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}

	/**
	 * Setter
	 * 
	 * @param livres
	 *            the livres to set
	 */
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

}
