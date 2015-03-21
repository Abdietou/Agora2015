package Servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import DAO.ClientInscriptionImpl;
import metier.IClientInscriptionEntity;


public class ControleurInscriptionClient extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IClientInscriptionEntity client;

	@Override
	public void init() throws ServletException {
		client = new ClientInscriptionImpl();
	}

}
