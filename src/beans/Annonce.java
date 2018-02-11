package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 * 
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class  Annonce {

	/**
	 * Default constructor
	 */
	public Annonce() {
		super();
		this.propositions=new HashSet<PropositionArticle>();
		
//		this.messages=new ArrayList<Message>();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected int id;
	
	/**
	 * 
	 */
	protected Date date;

	/**
	 * 
	 */
	protected String titre;

	/**
	 * 
	 */
	protected String pathImage;

	/**
	 * 
	 */
	protected String description;

	/**
	 * 
	 */
	protected EtatAnnonce etat;

	/**
	 * 
	 */
	
	@ManyToOne
	@JsonIgnore
	protected Etudiant etudiant;
	
	/**
	 * 
	 */
	
//	OneToMany(mappedBy="annonce")
//	protected List<Message> messages;
	
	
	
	
	@OneToMany(fetch=FetchType.EAGER ,mappedBy="annonce")
    protected Set<PropositionArticle> propositions;

	public Set<PropositionArticle> getPropositions() {
		return propositions;
	}

	public void setPropositions(Set<PropositionArticle> propositions) {
		this.propositions = propositions;
	}
    
	public void addProposition(PropositionArticle proposition) {
		this.propositions.add(proposition);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description2) {
		this.description = description2;
	}

	public EtatAnnonce getEtat() {
		return etat;
	}

	public void setEtat(EtatAnnonce etat) {
		this.etat = etat;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

//	public List<Message> getMessages() {
//		return messages;
//	}
//
//	public void setMessages(List<Message> messages) {
//		this.messages = messages;
//	}
//	
//	public void addMessage(Message message) {
//		this.messages.add(message);
//	}

	


}