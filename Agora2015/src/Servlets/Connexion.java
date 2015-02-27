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
import DAO_Entity.DAO_Utilisateur;
import Exceptions.ConnexionException;
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
		String password = request.getParameter( "password" );
		
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
	    	  System.out.println(userDao.conection( con,login,password));
			if(userDao.conection( con,login,password).equals("1"))
			{
				this.getServletContext().getRequestDispatcher( "/page_agent_admin.jsp" ).forward( request, response );
			}
			else if(userDao.conection( con,login,password).equals("2"))
			{
				this.getServletContext().getRequestDispatcher( "/page_service_technique.jsp" ).forward( request, response );
			}
			else if(userDao.conection( con,login,password).equals("3"))
			{
				this.getServletContext().getRequestDispatcher( "/page_service_comptable.jsp" ).forward( request, response );
			}
			else if(userDao.conection( con,login,password).equals("4"))
			{
				this.getServletContext().getRequestDispatcher( "/page_service_marketing.jsp" ).forward( request, response );
			}
			else
			{  	error_ID="ok";
			
			  UtilisateursSystemeEntity user = new UtilisateursSystemeEntity();				
				
				    user.setlogin(login);
					user.setpassword(password);
					request.setAttribute( "mauvais_id", error_ID );
					request.setAttribute( "user", user );
			//this.getServletContext().getRequestDispatcher( "/Connection.jsp" ).forward( request, response );
					request.getRequestDispatcher("/Connexion.jsp").forward(request, response);
				//this.getServletContext().getRequestDispatcher( "/Identifiant_utlisateur.jsp" ).forward( request, response );
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}

