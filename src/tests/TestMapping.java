package tests;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import beans.*;

public class TestMapping {
	
	@PersistenceContext
	static EntityManager em;
	public static void ajoutEtudiant(Etudiant et) {
		et.setNom("nom1");
		et.setPrenom("prenom1");
		et.setEmail("email1");
		em.persist(et);
	}
	
	public static List<Etudiant> consulterEtudiantes() {
		TypedQuery<Etudiant> req = em.createQuery("select c from Etudiant c",Etudiant.class);
		return req.getResultList();
		}

	public static void main() {
		Etudiant et=new Etudiant();
		ajoutEtudiant(et);
		Etudiant et1=consulterEtudiantes().get(0);
		System.out.println("nom "+et1.getNom());
		System.out.println("prenom "+et1.getPrenom());
		System.out.println("email "+et1.getEmail());
	}
}
