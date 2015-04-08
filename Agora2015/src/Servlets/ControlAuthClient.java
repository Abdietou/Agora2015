package Servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ClientInscritImpl;
import metier.IClientInscrit;

/**
 * Servlet implementation class ControlAuthClient
 */
@WebServlet("/AuthClient")
public class ControlAuthClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IClientInscrit cl_inscrit;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlAuthClient() {
    	cl_inscrit = new ClientInscritImpl();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		cl_inscrit = new ClientInscritImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		String password = request.getParameter("password");
		try {
		if(cl_inscrit.getClient(id).getId().equals(id) && cl_inscrit.getClient(id).getPassword().equals(password)){
			System.out.println("Connexion réussie, Bienvue :" + cl_inscrit.getClient(id).getPrenom() );
			HttpSession session = request.getSession();
			session.setAttribute("sessionClient", id);
			response.sendRedirect(request.getContextPath() + "/Accueil_client.jsp");
		}else{ 
			System.out.println("Erreur de saisie, veuillez recommencer");
		}
		} catch (RuntimeException e) {
			System.out.println("Ce compte client n'éxiste pas ! ");
			}
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
