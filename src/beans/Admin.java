package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Admin {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	protected int id;
	/**
	 * 
	 */
	protected String email;
	
	/**
	 * 
	 */
	protected String mdp;

	/**
	 * 
	 */
	protected String nom;

	/**
	 * 
	 */
	protected String prenom;

	/**
	 * 
	 */
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
