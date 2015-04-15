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

import DAO.ClientInscriptionImpl;
import DAO.ClientInscritImpl;
import DAO.ServiceTechniqueImpl;
import Modele.ClientInscritEntity;
import Modele.DemandeDevisClientEntity;
import Modele.DevisEntity;
import Modele.OuvrierInscritEntity;
import metier.IClientInscrit;
import metier.IServiceTechnique;

/**
 * Servlet implementation class ControlAfficheDemDevis
 */
@WebServlet("/AfficheDemDevisClient")
public class ControlAfficheDemDevisClient extends HttpServlet {
	private IServiceTechnique sc;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlAfficheDemDevisClient() {
    	 sc = new ServiceTechniqueImpl();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		 sc = new ServiceTechniqueImpl();
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
		HttpSession session = request.getSession();
		if(action!=null){
			if (action.equals("edit")){
			Long id = Long.parseLong(request.getParameter("id"));
			DemandeDevisClientEntity d = sc.getDemDeviClient(id);

			request.setAttribute("clientId", d.getId_devis());
			request.setAttribute("clientDomaine", d.getDomaine());
			request.setAttribute("clientTitre", d.getTitre());
			request.setAttribute("clientDescription", d.getDescription());
			request.setAttribute("clientDelai", d.getDelai());
			request.setAttribute("clientBudget", d.getBudget());
			request.setAttribute("clientAdresse", d.getAdresse());
			request.setAttribute("clientNom", d.getNom());
			request.setAttribute("clientPrenom", d.getPrenom());
			request.setAttribute("clientMail", d.getMail());
			request.setAttribute("clientTelephone", d.getTelephone());
			request.setAttribute("clientDate", d.getDate_debut_travaux());
			request.setAttribute("clientDem", d.getClient_demandeur().getId());
			}
			
			else if(action.equals("creer")){
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
				
				DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
				String date = request.getParameter("date");
				Date startDate=null;
				try {
					startDate = df.parse(date);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//ListeOuvriers
				
				Double prixTTC = Double.parseDouble(request.getParameter("prixTTC"));
				ClientInscritEntity idClient = (ClientInscritEntity) request.getAttribute("clientDem");
				OuvrierInscritEntity ListeOuvriers = (OuvrierInscritEntity) request.getAttribute("ListeOuvriers");
				//Long idClient = Long.parseLong(request.getParameter("idClient"));
				sc.CreerDevis(new DevisEntity(startDate, domaine, titre, description, delai, budget, adresse, nom, prenom, mail, telephone, idClient, ListeOuvriers, prixTTC));
			}
		}
		request.setAttribute("client", sc.listDevisClient());
		request.setAttribute("ouvrier", sc.listOuvrier());
		request.getRequestDispatcher("liste_demande_devis_client.jsp").forward(request, response);	
	}

}
