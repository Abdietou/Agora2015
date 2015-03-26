package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.InternauteImpl;
import Modele.InternauteEntity;
import metier.InterInternate;

@WebServlet("/InternauteDevis")
public class ControlDemandeInternaute extends HttpServlet {
	
	private InterInternate internaute;
	
	@Override
	public void init() throws ServletException {
		internaute = new InternauteImpl();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Valider")){
		String domaine = req.getParameter("domaine");
		String titre = req.getParameter("titre");
		String description = req.getParameter("description");
		String delai = req.getParameter("delai");
		String budget = req.getParameter("budget");
		String adresse = req.getParameter("adresse");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String mail = req.getParameter("mail");
		String telephone = req.getParameter("telephone");
		
		internaute.addDemande(new InternauteEntity(domaine, titre, description, delai, budget, adresse, nom, prenom, mail, telephone));
	}
		doGet(req, resp);
		}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("demande_devis.jsp").forward(req, resp);
	}
	
	

	
	
	


}
