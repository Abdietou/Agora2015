package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO_Entity.ConnexionBD;
import DAO_Entity.DAO_Internaute;
import Exceptions.ConnexionException;

@WebServlet(name = "Internaute", urlPatterns = { "/Internaute" })
public class Internaute extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	public Internaute() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String domaine = request.getParameter( "domaine" );
		String titre = request.getParameter( "tire" );
		String description = request.getParameter( "description" );
		String delai = request.getParameter( "delai" );
		String budget = request.getParameter( "budget" );
		String adresse = request.getParameter( "adresse" );
		String nom = request.getParameter( "nom" );
		String prenom = request.getParameter( "prenom" );
		String mail = request.getParameter( "mail" );
		String telephone = request.getParameter( "telephone" );
		
		Connection con = null;
		
		try {
			con= ConnexionBD.getInstance();
			DAO_Internaute internaute = new DAO_Internaute();
			if (internaute.creer(con, domaine, titre, description, delai, budget, adresse, nom, prenom, mail, telephone) == true) {
				//ici mettre une boite de dialogue qui confimera la demande d'inscription
			}
			if (!ConnexionBD.isValide()) {
				throw new ConnexionException(
						"Probleme de connexion au serveur.");
			}
		} catch (ConnexionException | SQLException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
	
	
	
	

}
