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
import DAO_Entity.DAO_ClientDemandeInscription;
import Exceptions.ConnexionException;

/**
 * Servlet implementation class inscription
 */

@WebServlet(name = "InscriptionClient", urlPatterns = { "/InscriptionClient" })
public class InscriptionClient extends HttpServlet{
	private static final long serialVersionUID = 1L;

	
	 /**
     * @see HttpServlet#HttpServlet()
     */
	
	public InscriptionClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter( "nom" );
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String ville = request.getParameter("ville");
		String code_postal = request.getParameter("code_postal");
		String telephone = request.getParameter("telephone");
		String mail = request.getParameter("mail");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		Connection con = null;
		
		try {
			con= ConnexionBD.getInstance();
			DAO_ClientDemandeInscription client = new DAO_ClientDemandeInscription();
			if (client.creer(con, nom, prenom, adresse, ville, code_postal, telephone, mail, login, password) == true) {
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
