package Servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.GestionDates;
import DAO.OuvrierInscriptionImpl;
import Modele.OuvrierInscriptionEntity;
import metier.IOuvrierInscription;

@WebServlet("/InscriptionOuvrier")
public class ControleurInscriptionOuvrier extends HttpServlet {
	
	private IOuvrierInscription ouvrier;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getParameter("formulaire_inscription_ouvrier.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String action = req.getParameter("action");
		if (action.equals("Valider")){
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			String login = req.getParameter("login");
			String password = req.getParameter("password");
			
			DateFormat df=new SimpleDateFormat("dd-MMM-yy");
			String disponibilite = req.getParameter("disponibilite");
			Date startDate=null;
			try {
				startDate = df.parse(disponibilite);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String prestation = req.getParameter("prestation");
			double prix = Double.parseDouble(req.getParameter("prix"));
			
			ouvrier.addOuvrier(new OuvrierInscriptionEntity(nom, prenom, login, password, startDate, prestation, prix));
			
			/*
			 * // variable String EN à partir  du String FR --> yyyy-MM-dd
								String strDateMySQL = GestionDates.chaineDateFRversEN(strDate);
								//pour la classe Client
								Date dtDate = new Date();
								dtDate = GestionDates.dateJavaEnDateSQL(dtDate);
			 */
			
		}
		doGet(req, resp);
	}

	@Override
	public void init() throws ServletException {
		ouvrier = new OuvrierInscriptionImpl();
	}
	
	

}
