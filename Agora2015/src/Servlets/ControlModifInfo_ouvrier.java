package Servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.OuvrierInscritImpl;
import Modele.OuvrierInscritEntity;
import metier.IOuvrierInscrit;

/**
 * Servlet implementation class ControlModifInfo_ouvrier
 */
@WebServlet("/ModifInfo_ouvrier")
public class ControlModifInfo_ouvrier extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IOuvrierInscrit ouv_inscrit; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlModifInfo_ouvrier() {
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

			if (action.equals("Modifier")){
				Long id = Long.parseLong(request.getParameter("id"));
				HttpSession session = request.getSession();
				try {
				
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				String login = request.getParameter("login");
				String password = request.getParameter("password");
				DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
				String disponibilite = request.getParameter("disponibilite");
				Date startDate=null;
				try {
					startDate = df.parse(disponibilite);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String prestation = request.getParameter("prestation");
				double prix = Double.parseDouble(request.getParameter("prix"));
				
				OuvrierInscritEntity ouv = new OuvrierInscritEntity(nom, prenom, login, password, startDate, prestation, prix);
				ouv.setId(id);
				ouv_inscrit.UpdateInfo(ouv);
				
				session.setAttribute("sessId", ouv_inscrit.getOuvrier(id).getId());
				session.setAttribute("sessNom", ouv_inscrit.getOuvrier(id).getNom());
				session.setAttribute("sessPrenom", ouv_inscrit.getOuvrier(id).getPrenom());
				session.setAttribute("sessLogin", ouv_inscrit.getOuvrier(id).getLogin());
				session.setAttribute("sessPassword", ouv_inscrit.getOuvrier(id).getPassword());
				session.setAttribute("sessDispo", ouv_inscrit.getOuvrier(id).getDisponibilite());
				session.setAttribute("sessPrestation", ouv_inscrit.getOuvrier(id).getPrestation());
				session.setAttribute("sessPrix", ouv_inscrit.getOuvrier(id).getPrix());
				
			} catch (Exception e) {
				
			}
			request.getRequestDispatcher("Accueil_ouvrier.jsp").forward(request, response);
			
	}
	}
}
