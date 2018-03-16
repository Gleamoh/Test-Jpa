/**
 * 
 */
package com.testjpa.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kevin M.
 *
 */
@Entity
@Table(name="emprunt")
public class Emprunt {

	/**
	 * id : int
	 */
	@Id
	private int id;

	/**
	 * dateDebut : LocalDateTime
	 */
	private LocalDateTime dateDebut;

	/**
	 * delai : int
	 */
	private int delai;

	/**
	 * dateFin : LocalDateTime
	 */
	private LocalDateTime dateFin;

	/**
	 * client : Client
	 */
	private Client client;

	/**
	 * livres : List<Livre>
	 */
	private List<Livre> livres;

	/**
	 * Constructor
	 * 
	 */
	public Emprunt() {
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
