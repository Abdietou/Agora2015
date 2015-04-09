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

import DAO.ClientDemandeDevisImpl;
import Modele.ClientInscritEntity;
import Modele.DemandeDevisClientEntity;
import metier.IClientDemandeDevis;

/**
 * Servlet implementation class ControlDemandeDevisClient
 */
@WebServlet("/DemandeDevisClient")
public class ControlDemandeDevisClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IClientDemandeDevis cl_dem_devis;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlDemandeDevisClient() {
        super();
        cl_dem_devis = new ClientDemandeDevisImpl();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		cl_dem_devis = new ClientDemandeDevisImpl();
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
		if (action.equals("Valider")){
		HttpSession session = request.getSession();
		Long client_demandeur = Long.parseLong(request.getParameter("id"));
		session.setAttribute("sessId", cl_dem_devis.getClient(client_demandeur).getId());
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		String disponibilite = request.getParameter("date_debut_travaux");
		Date startDate=null;
		try {
			startDate = df.parse(disponibilite);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String domaine = request.getParameter("domaine");
		String titre = request.getParameter("titre");
		String description = request.getParameter("description");
		String delai = request.getParameter("delai");
		String budget = request.getParameter("budget");
		String adresse = request.getParameter("adresse");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String mail = request.getParameter("mail");
		String telephone = request.getParameter("telephone");
		//Long client_demandeur = Long.parseLong(request.getParameter(cl_dem_devis.getClient(id).getId()));
		
		
		cl_dem_devis.addDevis(new DemandeDevisClientEntity(startDate, domaine, titre, description, delai, budget, adresse, nom, prenom, mail, telephone, cl_dem_devis.getClient(client_demandeur) ));
		
	}
		
	}

}
