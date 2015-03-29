package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AgentAdminImpl;
import Modele.ClientInscriptionEntity;
import Modele.ClientInscritEntity;
import metier.IAgentAdminEntity;

@WebServlet("/AgentAdmin")
public class ControlAfficheDemande extends HttpServlet {
	
	private IAgentAdminEntity agent;
	
	@Override
	public void init() throws ServletException {
		agent = new AgentAdminImpl();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action!=null)
		if (action.equals("supprimer")){
			Long id=Long.parseLong(request.getParameter("id"));
			agent.deleteClient(id);
		}
		else if (action.equals("supprimer2")){
			Long id=Long.parseLong(request.getParameter("id"));
			agent.deleteOuvrier(id);	
			
		}
		
		else if(action.equals("ajouter")){
			Long id=Long.parseLong(request.getParameter("id"));
			ClientInscriptionEntity cl = agent.getClient(id);
			Long id_client_inscrit = cl.getId();
			String nom = cl.getNom();
			String prenom = cl.getPrenom();
			String adresse = cl.getAdresse();
			String code_postal = cl.getCode_postal();
			String ville = cl.getVille();
			String telephone = cl.getTelephone();
			String mail = cl.getMail();
			String login = cl.getLogin();
			String password = cl.getPassword();
			agent.InscrireClient(new ClientInscritEntity(id_client_inscrit, nom, prenom, adresse, code_postal, ville, telephone, mail, login, password));
		}
		
		else if(action.equals("ajouter2")){
			
			
		}
		
		request.setAttribute("client", agent.listClient());
		request.setAttribute("ouvrier", agent.listOuvrier());
		request.getRequestDispatcher("page_agent_admin.jsp").forward(request, response);
	}
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	

}
