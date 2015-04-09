package Servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ServiceTechniqueImpl;
import metier.IServiceTechnique;

/**
 * Servlet implementation class ControlAfficheDemDevisInter
 */
@WebServlet("/AfficheDemDevisInter")
public class ControlAfficheDemDevisInter extends HttpServlet {

	private IServiceTechnique sc;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlAfficheDemDevisInter() {
       sc = new ServiceTechniqueImpl();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		sc = new ServiceTechniqueImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("internaute", sc.listInternauteDevis());
		request.getRequestDispatcher("liste_demande_devis_internaute.jsp").forward(request, response);;
	}

}
