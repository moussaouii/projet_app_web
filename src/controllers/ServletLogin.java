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
import facades.FacadeAdmin;
import facades.FacadeEtudiant;
import beans.Admin;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/login")

public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private FacadeEtudiant fEtudiant;
	@EJB
	private FacadeAdmin fAdmin;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward=UrlTool.LOGIN;
		request.getRequestDispatcher(forward).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String actionPost = request.getParameter("actionPost"); 
		String forward=UrlTool.LOGIN;// par defaut on redirige vers login
		if(actionPost!=null) {
			if(actionPost.equalsIgnoreCase("login")) {
				String email=request.getParameter("email");
				String mdp=request.getParameter("mdp");
				Etudiant etu;
				Admin ad;
					
				
					if((etu=fEtudiant.Authentification(email,mdp))!=null)
						{
						
							HttpSession session=request.getSession();
							session.setAttribute("etudiant", etu);
							response.sendRedirect(request.getContextPath() + UrlTool.SERVLET_ETUDIANT);
						}
					else if((ad=fAdmin.Authentification(email,mdp))!=null) {//admin
					
							HttpSession session=request.getSession();
							session.setAttribute("admin", ad);
							response.sendRedirect(request.getContextPath() + UrlTool.SERVLET_ADMIN);
						
					}
				
				//en cas d'erreur d'authentification
				request.setAttribute(AlertTool.DANGER, "Login ou mot de passe incorrect");
				forward=UrlTool.LOGIN;
			}	
		}
		request.getRequestDispatcher(forward).forward(request, response);
	}

}
