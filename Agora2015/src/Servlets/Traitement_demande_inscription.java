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

import DAO_Entity.DAO_AgentAdmin;
import DAO_Entity.DAO_Utilisateur;

@WebServlet("/Traitement_demande_inscription")
public class Traitement_demande_inscription extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Traitement_demande_inscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request,
		      HttpServletResponse response) throws ServletException, NullPointerException,
		      IOException {
		
		DAO_AgentAdmin dao_admin = new DAO_AgentAdmin();
		Connection con = null;
		if (request.getParameter("action") != null){
			
		}
			
	}

}
