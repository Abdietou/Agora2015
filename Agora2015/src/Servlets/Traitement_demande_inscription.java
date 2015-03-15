package Servlets;

import java.io.IOException;
import java.sql.Connection;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.ClientInscriptionBeans;
import DAO_Entity.DAO_AgentAdmin;

@WebServlet(name = "Traitement_demande_inscription", urlPatterns = { "/Traitement_demande_inscription" })
public class Traitement_demande_inscription extends HttpServlet {

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private static final long serialVersionUID = 1L;

	public Traitement_demande_inscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection con = null;
		DAO_AgentAdmin dao_admin = new DAO_AgentAdmin();
		
//	// Récupère les informations
//		String nom = req.getParameter("nom");
//		String prenom = req.getParameter("prenom");
//		String adresse = req.getParameter("adresse");
//		String ville = req.getParameter("ville");
//		String code_postal = req.getParameter("code_postal");
//		String telephone = req.getParameter("telephone");
//		String mail = req.getParameter("mail");
//		String login = req.getParameter("login");
//		String password = req.getParameter("password");
		
		ClientInscriptionBeans cl_inscription = new ClientInscriptionBeans();
		cl_inscription.setListe(dao_admin.getAll());
		//String tableau [] = tableau;
		req.setAttribute("tableau", cl_inscription);
		req.getRequestDispatcher("page_agent_admin.jsp").forward(req, resp);
		

	
		
		
//		try {
//			con = ConnexionBD.getInstance();
//			System.out.println("conection réussie");
//			if (!ConnexionBD.isValide()) {
//				throw new ConnexionException(
//						"Probleme de connexion au serveur.");
//			}
//		} catch (ConnexionException e) {
//			System.out.println(e.getMessage());
//			System.exit(1);
//		}
		
		
	}

}
