package Servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

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
		
		if(action!=null){
			if (action.equals("edit")){
			Long id_devis = Long.parseLong(request.getParameter("id_devis"));
			DemandeDevisClientEntity d = sc.getDemDeviClient(id_devis);
			HttpSession session = request.getSession();

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
			session.setAttribute("clientDem", d.getClient_demandeur().getId());
			session.setAttribute("cl", d.getClient_demandeur());
			}
			
			else if(action.equals("creer")){
//				String date_debut_travaux = request.getParameter("date_debut_travaux");
//				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//				Date date = new Date();
//				try {
//					date = df.parse(date_debut_travaux);
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}

				Long id_devis = Long.parseLong(request.getParameter("id_devis"));
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
				Double prixTTC = Double.parseDouble(request.getParameter("prixTTC"));
				
				//ClientInscritEntity idClient2 = (ClientInscritEntity) request.getSession().getAttribute("idClient");
//				Long idClient = Long.parseLong(request.getParameter("idClient"));
//				String idClient2 = Long.toString(idClient);
//				ClientInscritEntity idClient3 = (ClientInscritEntity) request.getSession().getAttribute(idClient2);
//				request.getSession().removeAttribute(idClient2);
				
				/* Alors récupération de la map des clients dans la session */
				HttpSession session = request.getSession();
				
				Map<Long, ClientInscritEntity> clients = (HashMap<Long, ClientInscritEntity>) session.getAttribute("cl");
				 /* Si aucune map n'existe, alors initialisation d'une nouvelle map */
				if ( clients == null ) {
					clients = new HashMap<Long, ClientInscritEntity>();
				}
				 /* Puis ajout du client de la commande courante dans la map */
				clients.put(sc.getDemDeviClient(id_devis).getClient_demandeur().getId(), sc.getDemDeviClient(id_devis).getClient_demandeur());
				/* Et enfin (ré)enregistrement de la map en session */
				session.setAttribute("cl", clients);
				ClientInscritEntity idClient = (ClientInscritEntity) session.getAttribute("cl");
				OuvrierInscritEntity ListeOuvriers = (OuvrierInscritEntity) request.getAttribute("ListeOuvriers");
				sc.CreerDevis(new DevisEntity(domaine, titre, description, delai, budget, adresse, nom, prenom, mail, telephone, idClient, ListeOuvriers, prixTTC));
			}
		}
		request.setAttribute("client", sc.listDevisClient());
		request.setAttribute("ouvrier", sc.listOuvrier());
		request.getRequestDispatcher("liste_demande_devis_client.jsp").forward(request, response);	
	}

}
