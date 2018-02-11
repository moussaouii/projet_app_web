package beans;


import java.util.*;

import javax.persistence.Entity;

/**
 * 
 */

@Entity
public class OffreService extends AnnonceService {

    /**
     * Default constructor
     */
    public OffreService() {
    	super();
    }

    /**
     * 
     */
    protected boolean prixFixe;
    
    /**
     * 
     */
    protected double prixHeure;

	public boolean isPrixFixe() {
		return prixFixe;
	}

	public void setPrixFixe(boolean prixFixe) {
		this.prixFixe = prixFixe;
	}

	public double getPrixHeure() {
		return prixHeure;
	}

	public void setPrixHeure(double prixHeure) {
		this.prixHeure = prixHeure;
	}
    
    

}