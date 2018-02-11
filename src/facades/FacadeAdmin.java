package facades;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import beans.Admin;
import beans.Etudiant;

@Singleton
public class FacadeAdmin {
	@PersistenceContext
	EntityManager em;
	public void updateAdmin(Etudiant e) {
		em.persist(e);
	}
	public Admin getAdminByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean existEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}
	public Admin Authentification(String email, String mdp) {
		// TODO Auto-generated method stub
		return null;
	}

}
