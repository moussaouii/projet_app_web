package facades;


import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import beans.Etudiant;
import beans.Ecole;
import beans.EtatEtudiant;


@Singleton
public class FacadeEtudiant {
	@PersistenceContext
	EntityManager em;
	
	
	public Etudiant findEtudiantById(int id) {
		Etudiant e = em.find(Etudiant.class, id);
		return e;
	}
	
	

	public Etudiant getEtudiantByEmail(String email) {
		Query queryFindByEmail = em.createQuery(
			    "SELECT OBJECT(e) FROM Etudiant e WHERE e.email = :email"
			);
		queryFindByEmail.setParameter("email", email);
		List<Etudiant> etudiants = queryFindByEmail.getResultList();
		if(etudiants!=null ) {
			if(!etudiants.isEmpty()) {
				return etudiants.get(0);
			}
		}
		
	return null;
	}

	public boolean existEmail(String email) {
		if(this.getEtudiantByEmail(email)==null) {
			return false;
		}else {
			return true;
		}
	}
	

	
	
	public Etudiant createEtudiant(String nom, String prenom, String email, String mdp, String numTel, int idEcole) {
		Etudiant etu=new Etudiant();
		etu.setNom(nom);
		etu.setMdp(mdp);
		etu.setPrenom(prenom);
		etu.setEmail(email);
		etu.setNumTel(numTel);
		etu.setEtat(EtatEtudiant.active);
		etu.setCoins(100);
		Ecole ecole = em.find(Ecole.class, idEcole);
		etu.setEcole(ecole);
		em.persist(etu);
		em.flush();
		Etudiant e = this.getEtudiantByEmail(email);
		return e;
	}
	
	
	public void updateEtudiant(Etudiant ePar) {
		 Etudiant e = em.find(Etudiant.class, ePar.getId());
		    if (e != null) {
				e.setNom(ePar.getNom());
				e.setPrenom(ePar.getPrenom());
				e.setEmail(ePar.getEmail());
				e.setNumTel(ePar.getNumTel());
				e.setEtat(ePar.getEtat());
				e.setCoins(ePar.getCoins());
				e.setMdp(ePar.getMdp());
		    }
		  em.flush();
	}
	
	
	public Etudiant Authentification(String email, String mdp) {
		Etudiant etu=null;
		Etudiant res=null;
		if(email!=null) {
			etu=this.getEtudiantByEmail(email);
			 if(etu!=null && email!=null && mdp!=null) {
					if( etu.getEmail().equals(email) && etu.getMdp().equals(mdp)   ){
						res=etu;
					}
			 }
		}
		return res;
	}


	
	
}
