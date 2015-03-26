package Servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClientInscriptionImpl;
import Modele.ClientInscriptionEntity;
import metier.IClientInscriptionEntity;

@WebServlet("/InscriptionClient")
public class ControleurInscriptionClient extends HttpServlet {

	
	private IClientInscriptionEntity client;

	@Override
	public void init() throws ServletException {
		client = new ClientInscriptionImpl();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Valider")){
			//Long id = Long.parseLong(req.getParameter("id"));
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			String adresse = req.getParameter("adresse");
			String ville = req.getParameter("ville");
			String code_postal = req.getParameter("code_postal");
			String telephone = req.getParameter("telephone");
			String mail = req.getParameter("mail");
			String login = req.getParameter("login");
			String password = req.getParameter("password");
			
			client.addClient(new ClientInscriptionEntity(nom, prenom, adresse, ville, code_postal, telephone, mail, login, password));
		}
		
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("formulaire_inscription_client.jsp").forward(req, resp);
	}
	
	

}
