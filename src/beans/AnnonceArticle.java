package beans;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AnnonceArticle extends Annonce {

	/**
	 * Default constructor
	 */
	public AnnonceArticle() {
		super();
		this.propositions=new HashSet<PropositionArticle>();
	}

	/**
     * 
     */


}