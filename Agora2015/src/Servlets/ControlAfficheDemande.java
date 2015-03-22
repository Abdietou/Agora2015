package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AgentAdminImpl;
import metier.IAgentAdminEntity;

public class ControlAfficheDemande extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IAgentAdminEntity agent;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("tableau", agent.listClient());
		req.getRequestDispatcher("page_agent_admin.jsp").forward(req, resp);
	}

	@Override
	public void init() throws ServletException {
		agent = new AgentAdminImpl();
	}
	
	

}
