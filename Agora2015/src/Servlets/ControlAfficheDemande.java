package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AgentAdminImpl;
import metier.IAgentAdminEntity;

@WebServlet("/AgentAdmin")
public class ControlAfficheDemande extends HttpServlet {
	
	private IAgentAdminEntity agent;
	
	@Override
	public void init() throws ServletException {
		agent = new AgentAdminImpl();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("client", agent.listClient());
		request.getRequestDispatcher("page_agent_admin.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
	
	
	

}
