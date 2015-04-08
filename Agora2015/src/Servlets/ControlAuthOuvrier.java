package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.OuvrierInscritImpl;
import metier.IOuvrierInscrit;

/**
 * Servlet implementation class ControlAuthOuvrier
 */
@WebServlet("/AuthOuvrier")
public class ControlAuthOuvrier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IOuvrierInscrit ouv_inscrit;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlAuthOuvrier() {
    	ouv_inscrit = new OuvrierInscritImpl();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ouv_inscrit = new OuvrierInscritImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long id = Long.parseLong(request.getParameter("id"));
		String password = request.getParameter("password");
		try {
		if(ouv_inscrit.getOuvrier(id).getId().equals(id) && ouv_inscrit.getOuvrier(id).getPassword().equals(password)){
			System.out.println("Connexion réussie, Bienvue :" + ouv_inscrit.getOuvrier(id).getPrenom() );
			HttpSession session = request.getSession();
			session.setAttribute("sessId", ouv_inscrit.getOuvrier(id).getId());
			session.setAttribute("sessNom", ouv_inscrit.getOuvrier(id).getNom());
			session.setAttribute("sessPrenom", ouv_inscrit.getOuvrier(id).getPrenom());
			session.setAttribute("sessLogin", ouv_inscrit.getOuvrier(id).getLogin());
			session.setAttribute("sessPassword", ouv_inscrit.getOuvrier(id).getPassword());
			session.setAttribute("sessDispo", ouv_inscrit.getOuvrier(id).getDisponibilite());
			session.setAttribute("sessPrestation", ouv_inscrit.getOuvrier(id).getPrestation());
			session.setAttribute("sessPrix", ouv_inscrit.getOuvrier(id).getPrix());
			response.sendRedirect("Accueil_ouvrier.jsp");
			
			 
			//request.getRequestDispatcher( "/Accueil_ouvrier.jsp" ).forward( request, response );
			
		}else{ 
			System.out.println("Erreur de saisie, veuillez recommencer");
			request.getRequestDispatcher("Auth_ouvrier").forward(request, response);
		}

		} catch (RuntimeException e) {
			System.out.println("Ce compte ouvrier n'éxiste pas ! ");
			request.getRequestDispatcher("Auth_ouvrier").forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);
		
		
	}

}
