package beans;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 */

@Entity
public class Message {

	/**
	 * Default constructor
	 */
	public Message() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	
	protected Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 */
	protected String text;
	
	/**
	 * 
	 */
	@ManyToOne
	@JsonIgnore
	protected Etudiant emetteur;

	/**
	 * 
	 */
	@ManyToOne
	@JsonIgnore
	protected Etudiant recepteur;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}



	public Etudiant getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(Etudiant emetteur) {
		this.emetteur = emetteur;
	}

	public Etudiant getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(Etudiant recepteur) {
		this.recepteur = recepteur;
	}

	public void setText(String msg) {
		this.text=msg;
		
	}

	

	
	

}