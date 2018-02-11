package controllers;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Etudiant;
import facades.FacadeEcole;
import facades.FacadeEtudiant;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/etudiant")
public class ServletEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@EJB
	private FacadeEtudiant fEtudiant;

	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEtudiant() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String forward=UrlTool.HOME_ET;
		String action = request.getParameter("action");
		if(action!=null){
			if(action.equalsIgnoreCase("voirProfil")){
				forward=UrlTool.VOIR_PROFIL_ET;
			}
			else if(action.equalsIgnoreCase("modifProfil")){
				forward=UrlTool.MODIF_PROFIL_ET;
			}
			else if(action.equalsIgnoreCase("changerMdp")){
				forward=UrlTool.CHANGER_MDP_ET;
			} else if (action.equalsIgnoreCase("deconnecter")){    
				if(session!=null) {
					session.invalidate(); 
				}

				forward =UrlTool.LOGIN;
			}
		}

		
		if(forward.equals(UrlTool.HOME_ET)) {
			response.sendRedirect("etudiant/annonce");  
	
			
		}

		request.getRequestDispatcher(forward).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String forward=UrlTool.LOGIN;
		String actionPost = request.getParameter("actionPost");
		Etudiant etuC=(Etudiant) session.getAttribute("etudiant");
		if(actionPost!=null) {
			if(actionPost.equalsIgnoreCase("modifProfil")){
				String nom=request.getParameter("nom");
				String prenom=request.getParameter("prenom");
				String email=request.getParameter("email");
				String numTel=request.getParameter("numTel");
				if((!email.equals(etuC.getEmail()) && !fEtudiant.existEmail(email) ) || email.equals(etuC.getEmail()) ) {
						etuC.setNom(nom);
						etuC.setPrenom(prenom);
						etuC.setEmail(email);
						etuC.setNumTel(numTel);
						fEtudiant.updateEtudiant(etuC);
						session.setAttribute("etudiant", etuC);
						String alert="Votre profil a été bien changé";
						request.setAttribute(AlertTool.SUCCESS,alert);
						forward=UrlTool.VOIR_PROFIL_ET;
					
					
				}else {

					String alert="cet email correspont à une autre compte";
					request.setAttribute(AlertTool.DANGER,alert);
					forward=UrlTool.MODIF_PROFIL_ET;
				}

			}
			else if(actionPost.equalsIgnoreCase("modifMdp")){
				String mdp=request.getParameter("mdp");
				String ancienMdp=request.getParameter("mdpA");
				if(etuC.getMdp().equals(ancienMdp)) {
					etuC.setMdp(mdp);
					fEtudiant.updateEtudiant(etuC);
					session.setAttribute("etudiant", etuC);
					String alert="Votre mot de passe a été bien changé";
					request.setAttribute(AlertTool.SUCCESS,alert);
					forward=UrlTool.VOIR_PROFIL_ET;
				}else {//l'ancien mot de passe est incorrect
					String alert="l'ancien mot de passe est incorrect";
					request.setAttribute(AlertTool.DANGER,alert);
					forward=UrlTool.CHANGER_MDP_ET;
				}

			}
		}
		
		
		if(forward.equals(UrlTool.HOME_ET)) {
			response.sendRedirect("etudiant/annonce");  
	
			
		}

		request.getRequestDispatcher(forward).forward(request, response);

	}

}
