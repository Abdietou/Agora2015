package DAO_Entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_Internaute {
	/**
	 * Recherche une instance depuis la base de données à partir de l'identifiant
	 * 
	 * @param con
	 * @param id
	 * @return l'instance
	 * @throws SQLException
	 */
	
	public synchronized boolean creer(Connection con, String domaine, String titre, String description, String delai, String budget,
			String adresse, String nom, String prenom, String mail, String telephone) throws SQLException {
		String requete = "";
		ResultSet resultats=null;
		
		String sql = "SELECT * FROM demande_devis_internaute WHERE mail = '"+ mail + "'" ;
	     try {
	    	 Statement stmt = con.createStatement();
	    	
	    	 resultats = stmt.executeQuery(sql);
		    	//System.out.println(resultats);
	    	
	    	 } catch (SQLException e) { 	
	    	
	    	 }
	     //Pour vérifier si l'email existe déjà dans la base
	     if(!resultats.next())
	     {    	 		
		requete = "INSERT INTO agora.demande_devis_internaute (domaine, titre, description, delai, budget, adresse, nom, prenom, mail, telephone) VALUES ('" + domaine + "', '"  + titre + "', '" + description + "', '" + delai + "', '" + budget + "','" + adresse + "','" + nom + "', '" + prenom + "', '" + mail + "', '" + telephone + "')";
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(requete);
			//System.out.println("créé");
			
			} catch (SQLException e) {
			e.printStackTrace();
			}
		return true;
	     }
		else
		{	// exception à gérer
			//System.out.println("Existe déjà");
			return false;
		}
	}

}
