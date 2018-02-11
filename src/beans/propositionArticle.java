package beans;


import java.util.*;

/**
 * 
 */
public class propositionArticle extends Proposition {

	/**
	 * Default constructor
	 */
	public propositionArticle() {
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