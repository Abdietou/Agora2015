package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.ClientInscriptionBeans;
import DAO_Entity.ConnexionBD;
import DAO_Entity.DAO_AgentAdmin;
import DAO_Entity.DAO_Utilisateur;
import Exceptions.ConnexionException;

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
		
		ClientInscriptionBeans cl_inscription = new ClientInscriptionBeans();
		cl_inscription.setListe_demande_inscription(dao_admin.getAll());
		//String tableau [] = tableau;
		req.setAttribute("tableau", cl_inscription);
		req.getRequestDispatcher("page_agent_admin.jsp").forward(req, resp);
		
//		// Récupère les informations
//		String id = request.getParameter("id_client_inscription");
//		String nom = request.getParameter("nom");
//		String prenom = request.getParameter("prenom");
//		String adresse = request.getParameter("adresse");
//		String ville = request.getParameter("ville");
//		String code_postal = request.getParameter("code_postal");
//		String telephone = request.getParameter("telephone");
//		String mail = request.getParameter("mail");
//		String login = request.getParameter("login");
//		String password = request.getParameter("password");
	
		
		
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
