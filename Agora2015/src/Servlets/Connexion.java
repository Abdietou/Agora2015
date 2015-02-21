package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO_Entite.Connexion;
import DAO_Entity.ConnexionBD;
import DAO_Entity.DAO_Utilisateur;
import Exceptions.ConnexionException;
import Modele.Utilisateurs.Utilisateur;
import Modele.UtilisateursSystemeEntity;

/**
 * Servlet implementation class connexion
 */
@WebServlet("/connexion")
public class Connexion extends HttpServlet {

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	private static final long serialVersionUID = 1L;

	public Connexion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String login = request.getParameter( "login" );
		String mdp = request.getParameter( "mdp" );
		
		DAO_Utilisateur userDao = new DAO_Utilisateur();
		Connection con = null;
		String error_ID = null;
		
		try{
			con = ConnexionBD.getInstance();
			System.out.println("conection réussie");
			if (!ConnexionBD.isValide()) {
				throw new ConnexionException(
						"Probleme de connexion au serveur.");
			}
			
		} catch (ConnexionException e) {
			System.out.println(e.getMessage());
			System.exit(1);
			
		}
		
		try {
	    	  System.out.println(userDao.conection( con,login,mdp));
			if(userDao.conection( con,login,mdp).equals("1"))
			{
				
			
				this.getServletContext().getRequestDispatcher( "/page_employe.jsp" ).forward( request, response );
			}
			else if(userDao.conection( con,login,mdp).equals("2"))
			{
				
				this.getServletContext().getRequestDispatcher( "/page_direction_des_moyens.jsp" ).forward( request, response );
			}
			else
			{  	error_ID="ok";
			  UtilisateursSystemeEntity user=new UtilisateursSystemeEntity();
				
				
				    user.SetIdentifiant(login);
					user.mot_passe(mdp);
					request.setAttribute( "mauvais_id", mauvais_id );
					  request.setAttribute( "user", user );
			//this.getServletContext().getRequestDispatcher( "/Connection.jsp" ).forward( request, response );
					request.getRequestDispatcher("/Connection.jsp").forward(request, response);
				//this.getServletContext().getRequestDispatcher( "/Identifiant_utlisateur.jsp" ).forward( request, response );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}

