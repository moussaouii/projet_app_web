package facades;

import java.util.Collection;
import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import beans.Etudiant;


@Singleton
@Path("/")
public class FacadeTest {
	@PersistenceContext
	EntityManager em;
	
	@GET
	@Path("addetudiant")
	public void test() {
		Etudiant e=new Etudiant();
		e.setNom("nomTest");
		e.setPrenom("prenomTest");
		em.persist(e);
		
		
	}
	
	@GET
	@Path("listetudiants")
    @Produces({ "application/json" })
	public Collection<Etudiant> listPersons() {
		return em.createQuery("from Etudiant", Etudiant.class).getResultList();
	}
}
