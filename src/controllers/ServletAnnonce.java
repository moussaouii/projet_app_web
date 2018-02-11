package controllers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import beans.Annonce;
import beans.EtatProposition;
import beans.Etudiant;
import beans.Message;
import beans.OffreArticle;
import beans.PropositionArticle;
import facades.FacadeAnnonce;
import facades.FacadeEtudiant;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/etudiant/annonce")
public class ServletAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	 
	
	
	@EJB
	private FacadeAnnonce fAnnonce;
	
	
	@EJB
	private FacadeEtudiant fEtudiant;
	
	
    /** 
     * @see HttpServlet#HttpServlet()
     */
    public ServletAnnonce() {
        super();
       
    }
    
    
    
    
	public void test()  {
		   // Initialization code...
//			OffreArticle a=new OffreArticle();
//			a.setDate(new Date());
//			a.setDescription("descripetion");
//			a.setNbArticle(1);
//		
//			a.setPrixArticle(11.0);
//			a.setPrixFixe(false);
//			
//			fAnnonce.CreateOffreArticle(a);
		
		
	}
    
    
    
    
    
    
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.test();
		String forward=UrlTool.HOME_ET;
		HttpSession session=request.getSession(false);
		Etudiant e=(Etudiant)session.getAttribute("etudiant");
		String action = request.getParameter("action");
		if(action!=null){
			if(action.equalsIgnoreCase("addOffreArticle")){
				forward=UrlTool.ADD_OFFRE_ARTICLE;
			}
			else if(action.equalsIgnoreCase("addOffreService")){
				forward=UrlTool.ADD_OFFRE_SERVICE;
			}else if(action.equalsIgnoreCase("accepterProposition")) {
				int id = Integer.parseInt(request.getParameter("id"));
				PropositionArticle p=fAnnonce.accepterProposition(id);
				
				Set<PropositionArticle> liP=fAnnonce.getProposition(p.getAnnonce().getId());
				request.setAttribute("liP",liP);
			
				forward =UrlTool.SHOW_PROPOSITIONS;
				
				
			}else if(action.equalsIgnoreCase("refuserProposition")) {
				int id = Integer.parseInt(request.getParameter("id"));
				
				
				
				
			}else if(action.equalsIgnoreCase("showPropositions")) {
				int id = Integer.parseInt(request.getParameter("id"));
				Set<PropositionArticle> liP=fAnnonce.getProposition(id);
				request.setAttribute("liP",liP);
			
				forward =UrlTool.SHOW_PROPOSITIONS;
			
			}else if(action.equalsIgnoreCase("addDemandeService")){
				forward=UrlTool.ADD_DEMANDE_SERVICE;
			}else if (action.equalsIgnoreCase("showAnnoncesArchivees")){    
				forward =UrlTool.SHOW_ANNONCES_ARCHIVES;
			}else if (action.equalsIgnoreCase("showAnnoncesEnCours")){    
				Set<Annonce> annonces=fAnnonce.getAnnoces(e.getId());
				
				request.setAttribute("liA",annonces);
				
				
				
				
				forward =UrlTool.SHOW_ANNONCES_ENCOURS;
			}else if (action.equalsIgnoreCase("showMessages")){  
				
				forward =UrlTool.SHOW_MSGS;
				e=fEtudiant.findEtudiantById(e.getId());
	
				request.setAttribute("liM",e.getMessagesR());
				
			}else if (action.equalsIgnoreCase("showOne")) {
				forward =UrlTool.SHOW_ONE_ANNONCE;
				int id = Integer.parseInt(request.getParameter("id"));
				Annonce a=fAnnonce.findAnnonceById(id);
				request.setAttribute("a", a);
				
			}
		}
		

		
		if(forward.equals(UrlTool.HOME_ET)) {
			request.setAttribute("liA", fAnnonce.getAllAnnoces());
			
		}


		request.getRequestDispatcher(forward).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward=UrlTool.HOME_ET;
		String action = request.getParameter("actionPost");
		HttpSession session=request.getSession(false);
		Etudiant e=(Etudiant)session.getAttribute("etudiant");
		if(action!=null) {
			if(action.equalsIgnoreCase("addOffreArticle")) {

			    ServletContext context = request.getServletContext();
			    String appPath = context.getRealPath("");
			    String rpath = "image/";

			    String path = appPath + "/"+rpath;
				
				OffreArticle a=new OffreArticle();
				a.setDate(new Date());
				//a.setEtudiant(e);

				boolean isMultipart = ServletFileUpload.isMultipartContent(request);
				
				
		        // process only if its multipart content
		        if (isMultipart) {
		                // Create a factory for disk-based file items
		                FileItemFactory factory = new DiskFileItemFactory();

		                // Create a new file upload handler
		                ServletFileUpload upload = new ServletFileUpload(factory);
		                try {
		                    // Parse the request
		                    List<FileItem> multiparts = upload.parseRequest(request);
		                   for (FileItem item : multiparts) {
		                   if (!item.isFormField()) {
		                	  String name = a.getDate().toString()+"_"+e.getId();
		                	   String pathImageAbs=path + name;
		                	   String pathImageRel=rpath + name;
		                	   a.setPathImage(pathImageRel);
		                	   
		                	   item.write(new File(pathImageAbs));
		                   }else {
		                       String fieldname = item.getFieldName();
		                       String fieldvalue = item.getString();
		                       if(fieldname.equals("titre")) {
		                    	   String titre=fieldvalue ;
		                    	   a.setTitre(titre);
		                    	   
		                       }else if(fieldname.equals("prix")) {
		                    	   double prix=Double.parseDouble(fieldvalue);
		                    	   a.setPrixArticle(prix);
		                    	   
		                       }else if(fieldname.equals("description")) {
		                    	   String description=fieldvalue ;
		                    	   a.setDescription(description);
		                    	   
		                    	   
		                       }else if(fieldname.equals("nbArticle")){
		                    	   int nbArticle=Integer.parseInt(fieldvalue);
		                    	   a.setNbArticle(nbArticle);
		                    	   
		                       }else if((fieldname.equals("prixFixe"))) {
		                    	   String[] results = request.getParameterValues("prixFixe");
			           				boolean prixFixe=false;
			           				if(fieldvalue.equals("prixFixe")) {
			           					prixFixe=true;
			           				}
			           				a.setPrixFixe(prixFixe);	
		                       }		   
		                   }
		                }
		                        
		                fAnnonce.CreateOffreArticle(a, e.getId());
		                   
		                // File uploaded successfully
		                request.setAttribute(AlertTool.SUCCESS, "Votre article a été bien ajouté");
		               
//		                List<OffreArticle> annonces= new ArrayList<OffreArticle>();
//		                annonces.add(a);
//		                request.setAttribute("annonces", annonces);
		                


		                } 
		                catch (Exception ex) 
		                {
		                 request.setAttribute(AlertTool.DANGER, " erreur lors d'upload d'image " + ex);
		                }
		        }
			}else if(action.equalsIgnoreCase("addMessage")) {
				String msg=request.getParameter("msg");
				int idRecepteur=Integer.parseInt(request.getParameter("idRecepteur"));
				Message m=new Message();
				m.setText(msg);
				m.setEmetteur(e);
				m.setDate(new Date());
				fAnnonce.CreateMsg(m,idRecepteur);
				request.setAttribute(AlertTool.SUCCESS, "Message envoyé");
				
			}else if(action.equalsIgnoreCase("addPropositionOffreArticle")) {
				double prix=Double.parseDouble(request.getParameter("prix"));
				int nbArticle=Integer.parseInt(request.getParameter("nbArticle"));
				int idAnnonce=Integer.parseInt(request.getParameter("id"));
				PropositionArticle p=new PropositionArticle();	
				p.setNbArticle(nbArticle);
				p.setEtat(EtatProposition.enCours);
				p.setEtudiant(e);
				p.setPrixArticle(prix);
				fAnnonce.CreatePropositionArticle(p,idAnnonce);
				request.setAttribute(AlertTool.SUCCESS, "Proposition envoyé");
			}else if(action.equalsIgnoreCase("repondreMsg")) {
				String msg=request.getParameter("msg");
				int idEmetteur=Integer.parseInt(request.getParameter("idEmetteur"));
				Message m=new Message();
				m.setEmetteur(e);
				m.setDate(new Date());
				
				m.setText(msg);
				fAnnonce.CreateMsg(m,idEmetteur);
				request.setAttribute(AlertTool.SUCCESS, "Message envoyé");
			}
		}
		
		
		if(forward.equals(UrlTool.HOME_ET)) {
			request.setAttribute("liA", fAnnonce.getAllAnnoces());
			
		}
       
		
    	request.getRequestDispatcher(forward).forward(request, response);
		
	}
	
	
	

}
