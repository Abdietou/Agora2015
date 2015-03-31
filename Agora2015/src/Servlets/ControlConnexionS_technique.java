package Servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ServicesImpl;
import metier.IServices;

/**
 * Servlet implementation class ControlConnexionS_comptable
 */
@WebServlet("/S_technique")
public class ControlConnexionS_technique extends HttpServlet {
	
	private IServices sc;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlConnexionS_technique() {
       sc = new ServicesImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		 if (login.equals(sc.getST(login).getLogin()) && password.equals(sc.getST(login).getPassword())) {
			 System.out.println("conection réussie");
			 this.getServletContext().getRequestDispatcher( "/page_service_technique.jsp" ).forward( request, response );
		 	}else {
				System.out.println("Erreur authentification");
		 }
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
