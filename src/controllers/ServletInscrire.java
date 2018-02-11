package controllers;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Ecole;
import beans.Etudiant;
import facades.FacadeAdmin;
import facades.FacadeEcole;
import facades.FacadeEtudiant;

/**
 * Servlet implementation class ServletInscrire
 */
@WebServlet("/inscrire")
public class ServletInscrire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
    private FacadeEtudiant fEtudiant;
	@EJB
    private FacadeAdmin fAdmin;
	
	@EJB
	private FacadeEcole fEcole;
	
	public void test()  {
		   // Initialization code...
		fEcole.createEcole("Enseeiht");
		fEcole.createEcole("ENSIAS");
		
		
		
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInscrire() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.test();//tester
		
		List<Ecole> ecoles=fEcole.getAllEcoles();
		request.setAttribute("ecoles", ecoles);
		String forward=UrlTool.INSCRIRE;
		request.getRequestDispatcher(forward).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionPost = request.getParameter("actionPost");
		String forward=UrlTool.LOGIN;// par defaut on redirige vers Inscrire
		if(actionPost!=null) {
			if(actionPost.equalsIgnoreCase("inscrire")) {
				String nom=request.getParameter("nom");
				String prenom=request.getParameter("prenom");
				String email=request.getParameter("email");
				String mdp=request.getParameter("mdp");
				String numTel=request.getParameter("numTel");
				int idEcole=Integer.parseInt(request.getParameter("ecole"));
				
				if(!this.fAdmin.existEmail(email) && !this.fEtudiant.existEmail(email)) {
				
					Etudiant etu=this.fEtudiant.createEtudiant(nom,prenom,email,mdp,numTel,idEcole);	
					HttpSession session=request.getSession();
					session.setAttribute("etudiant", etu);
					response.sendRedirect(request.getContextPath()+UrlTool.SERVLET_ETUDIANT);
				}else {// email daja exist
					forward=UrlTool.LOGIN;
					request.setAttribute(AlertTool.WANRING,"Vous êtes déja inscrit ");
				}
			}
		}
		request.getRequestDispatcher(forward).forward(request, response);
		
	}

}
