package beans;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 */

@Entity
public class PropositionService extends Proposition {

	/**
	 * Default constructor
	 */
	public PropositionService() {
		super();
	}

	/**
	 * 
	 */
	protected double prixHeure;

	/**
	 * 
	 */
	protected int nbHeures;

	
	/**
	 * 
	 */
	@ManyToOne
	@JsonIgnore
	protected AnnonceService annonce;


	public double getPrixHeure() {
		return prixHeure;
	}


	public void setPrixHeure(double prixHeure) {
		this.prixHeure = prixHeure;
	}


	public int getNbHeures() {
		return nbHeures;
	}


	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}


	public AnnonceService getAnnonce() {
		return annonce;
	}


	public void setAnnonce(AnnonceService annonce) {
		this.annonce = annonce;
	}
	
	

}