package beans;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 */
 @Entity
public class PropositionArticle extends Proposition {

	/**
	 * Default constructor
	 */
	public PropositionArticle() {
		super();
	}

	/**
	 * 
	 */
	protected double prixArticle;
	
	/**
	 * 
	 */
	protected int nbArticle;
	
	/**
	 * 
	 */
	
	@ManyToOne
	@JsonIgnore
	protected AnnonceArticle annonce;

	public double getPrixArticle() {
		return prixArticle;
	}

	public void setPrixArticle(double prixArticle) {
		this.prixArticle = prixArticle;
	}

	public int getNbArticle() {
		return nbArticle;
	}

	public void setNbArticle(int nbArticle) {
		this.nbArticle = nbArticle;
	}

	public AnnonceArticle getAnnonce() {
		return annonce;
	}

	public void setAnnonce(AnnonceArticle annonce) {
		this.annonce = annonce;
	}

	

}