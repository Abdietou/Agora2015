package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AgentAdminImpl;
import DAO.ServicesImpl;
import metier.IAgentAdminEntity;
import metier.IServices;

/**
 * Servlet implementation class ControlConnexion
 */
@WebServlet("/ControlConnexion")
public class ControlConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IServices agent;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlConnexion() {
       agent = new ServicesImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		 if (login.equals(agent.getAdmin(login).getLogin()) && password.equals(agent.getAdmin(login).getPassword())) {
			 System.out.println("conection réussie");
			 // mettre un try catch quelque part pour spécifié que l'agent est introuvable
			 this.getServletContext().getRequestDispatcher( "/agent" ).forward( request, response ); 
		 } else {
				System.out.println("Erreur authentification");
			}
		 try {
			 
		 } catch (RuntimeException e){
			 System.out.println("Cette utilisateur n'éxiste pas !");
		 }
			 
			/* else if(login.equals(agent.getST(login).getLogin())){
				 
			 }*/
			 
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
