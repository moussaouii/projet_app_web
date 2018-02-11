package beans;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AnnonceService extends Annonce {

	/**
	 * Default constructor
	 */
	public AnnonceService() {
		super();
		this.propositions=new ArrayList<PropositionService>();
	}

	/**
	 * horaire de préference
	 */
	private String HorairePref;


	/**
     * 
     */
	
	@OneToMany(mappedBy="annonce")
    protected List<PropositionService> propositions;


	public String getHorairePref() {
		return HorairePref;
	}


	public void setHorairePref(String horairePref) {
		HorairePref = horairePref;
	}



    

}