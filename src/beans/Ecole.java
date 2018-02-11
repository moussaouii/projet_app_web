package beans;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 */
@Entity
public class Ecole {

	/**
	 * Default constructor
	 */
	public Ecole() {
		super();
		etudiants=new ArrayList<Etudiant>();
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	
	/**
	 * 
	 */
	protected String nom;

	/**
	 * 
	 */
	protected double coinValeurEuro;
	
	/**
	 * 
	 */
	
	@OneToMany(mappedBy="ecole")
	protected List<Etudiant> etudiants;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getCoinValeurEuro() {
		return coinValeurEuro;
	}

	public void setCoinValeurEuro(double coinValeurEuro) {
		this.coinValeurEuro = coinValeurEuro;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	public void addEtudiant(Etudiant etudiant) {
		this.etudiants.add(etudiant);
	}



}