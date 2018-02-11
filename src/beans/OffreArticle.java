package beans;


import java.util.*;

import javax.persistence.Entity;

/**
 * 
 */

@Entity
public class OffreArticle extends AnnonceArticle {

    /**
     * Default constructor
     */
    public OffreArticle() {
    	super();
    }
    
    /**
     * 
     */
    protected int nbArticle;
    
    /**
     * 
     */
    protected boolean prixFixe;
    
    /**
     * 
     */
    protected double prixArticle;

	public int getNbArticle() {
		return nbArticle;
	}

	public void setNbArticle(int nbArticle) {
		this.nbArticle = nbArticle;
	}

	public boolean isPrixFixe() {
		return prixFixe;
	}

	public void setPrixFixe(boolean prixFixe) {
		this.prixFixe = prixFixe;
	}

	public double getPrixArticle() {
		return prixArticle;
	}

	public void setPrixArticle(double prixArticle) {
		this.prixArticle = prixArticle;
	}
    
    
    

}