package beans;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Proposition {

	/**
	 * Default constructor
	 */
	public Proposition() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected int id;

	/**
	 * 
	 */
	protected Date dateRencontre;

	/**
	 * 
	 */
	protected EtatProposition etat;
	
	/**
	 * 
	 */
	@ManyToOne
	@JsonIgnore
	protected Etudiant etudiant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateRencontre() {
		return dateRencontre;
	}

	public void setDateRencontre(Date dateRencontre) {
		this.dateRencontre = dateRencontre;
	}

	public EtatProposition getEtat() {
		return etat;
	}

	public void setEtat(EtatProposition etat) {
		this.etat = etat;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}


	


}