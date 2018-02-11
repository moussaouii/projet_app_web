package beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.ws.rs.ext.ParamConverter.Lazy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


import java.util.Set;
/**
 * 
 */

@Entity
public class Etudiant {

	/**
	 * Default constructor
	 */
	public Etudiant() {
		super();
		this.messagesE=new ArrayList<Message>();
		this.messagesR=new ArrayList<Message>();
		this.annoces=new HashSet<Annonce>();
		this.propositions=new ArrayList<Proposition>();
	}
	
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
	protected String numTel;


	/**
	 * 
	 */
	protected double coins;
	
	protected EtatEtudiant etat;
	

	/**
	 * 
	 */
	@ManyToOne
	@JsonIgnore
	protected Ecole ecole;
	
	/**
	 * 
	 */
	@OneToMany(fetch=FetchType.EAGER ,mappedBy="etudiant")
	protected Set<Annonce> annoces;
	
	/**
	 * 
	 */
	@OneToMany(mappedBy="emetteur")
	protected List<Message> messagesE;
	
	
	@OneToMany(fetch=FetchType.EAGER ,mappedBy="recepteur")
	protected List<Message> messagesR;
	
	/**
	 * 
	 */
	@OneToMany(mappedBy="etudiant")
	protected List<Proposition> propositions;

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

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public double getCoins() {
		return coins;
	}

	public void setCoins(double coins) {
		this.coins = coins;
	}

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	public Set<Annonce> getAnnoces() {
		return annoces;
	}

	public void setAnnoces(Set<Annonce> annoces) {
		this.annoces = annoces;
	}
	
	public void addAnnoce(Annonce annoce) {
		this.annoces.add(annoce);
	}

	public List<Message> getMessagesE() {
		return messagesE;
	}

	public void setMessagesE(List<Message> messages) {
		this.messagesE = messages;
	}
	
	public void addMessageE(Message message) {
		this.messagesE.add(message);
	}
	
	
	
	public List<Message> getMessagesR() {
		return messagesR;
	}

	public void setMessagesR(List<Message> messages) {
		this.messagesR = messages;
	}
	
	public void addMessageR(Message message) {
		this.messagesR.add(message);
	}

	public List<Proposition> getPropositions() {
		return propositions;
	}

	public void setPropositions(List<Proposition> propositions) {
		this.propositions = propositions;
	}

	public void addProposition(Proposition proposition) {
		this.propositions.add(proposition);
	}



	public EtatEtudiant getEtat() {
		return etat;
	}

	public void setEtat(EtatEtudiant etat) {
		this.etat = etat;
	}







}