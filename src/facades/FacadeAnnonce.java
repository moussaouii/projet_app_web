package facades;


import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import beans.Annonce;
import beans.AnnonceArticle;
import beans.Ecole;
import beans.EtatAnnonce;
import beans.EtatProposition;
import beans.Etudiant;
import beans.Message;
import beans.OffreArticle;
import beans.OffreService;
import beans.PropositionArticle;
import controllers.AlertTool;


@Singleton
public class FacadeAnnonce {
	@PersistenceContext
	EntityManager em;
	
	public void CreateOffreArticle(Annonce a,int id) {
		Etudiant e= em.find(Etudiant.class, id);
		a.setEtudiant(e);
		a.setEtat(EtatAnnonce.enCours);
		em.persist(a);
		em.flush();
	}
	
	public Annonce findAnnonceById(int id) {
		Annonce a= em.find(Annonce.class, id);
		return a;
	}
	

	
	
	public List<Annonce> getAllAnnoces() {
		 TypedQuery<Annonce> req = em.createQuery("select a from Annonce a",
		 Annonce.class);
		 return req.getResultList();
	}
	
	public List<OffreArticle> getAllOffreArticles() {
		 TypedQuery<OffreArticle> req = em.createQuery("select a from OffreArticle a",
		OffreArticle.class);
		 return req.getResultList();
	}
	
	
	public List<OffreService> getAllOffreServices() {
		 TypedQuery<OffreService> req = em.createQuery("select a from OffreService a",
		OffreService.class);
		 return req.getResultList();
	}

	public void CreateMsg(Message m, int idRecepteur) {
		Etudiant e= em.find(Etudiant.class, idRecepteur);
		m.setRecepteur(e);
		em.persist(m);
		em.flush();
		
	}

	public List<Message> getMsgs(int id) {
		Etudiant e= em.find(Etudiant.class, id);
		
		return e.getMessagesR();
	}

	public void CreatePropositionArticle(PropositionArticle p, int idAnnonce) {
		AnnonceArticle a= em.find(AnnonceArticle.class, idAnnonce);
		p.setAnnonce(a);
		em.persist(p);
		em.flush();
		
	}

	public Set<Annonce> getAnnoces(int id) {
		Etudiant e= em.find(Etudiant.class, id);
		
		return e.getAnnoces();
	}

	public Set<PropositionArticle> getProposition(int id) {
		Annonce a= em.find(Annonce.class, id);
		return a.getPropositions();
		
		
	}

	public PropositionArticle accepterProposition(int id) {
		PropositionArticle p= em.find(PropositionArticle.class, id);
		p.setEtat(EtatProposition.accepte);
		//Annonce a= em.find(Annonce.class, p.getAnnonce().getId());
		Message m=new Message();
		m.setText("Votre Propostion pour l'annonce "+p.getAnnonce().getTitre()+"a été acceptée");
		m.setEmetteur(p.getAnnonce().getEtudiant());
		m.setDate(new Date());
		m.setRecepteur(p.getEtudiant());
		em.persist(m);
	
		
		
		
		return p;
	}

	
	
}
