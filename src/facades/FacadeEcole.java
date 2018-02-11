package facades;


import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import beans.Etudiant;
import beans.Ecole;


@Singleton
public class FacadeEcole {
	@PersistenceContext
	EntityManager em;
	public List<Ecole> getAllEcoles() {
		 TypedQuery<Ecole> req = em.createQuery("select e from Ecole e",
		 Ecole.class);
		 return req.getResultList();
	}
	
	
	
	public Ecole createEcole(String nom) {
		Ecole e=new Ecole();
		e.setNom(nom);
		e.setCoinValeurEuro(1.00);
		em.persist(e);

		return e;
	}
	

	




	
	
}
