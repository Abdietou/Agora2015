package DAO_Entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_ClientDemandeInscription {
	/**
	 * Recherche une instance depuis la base de données à partir de l'identifiant
	 * 
	 * @param con
	 * @param id
	 * @return l'instance
	 * @throws SQLException
	 */
	

	public synchronized boolean creer(Connection con, String nom, String prenom, String adresse, String ville,
			String code_postal, String telephone, String mail, String login, String password) throws SQLException {
		String requete = "";
		ResultSet resultats=null;
		
		String sql = "SELECT * FROM client_inscription WHERE mail = '"+ mail + "'" ;
	     try {
	    	 Statement stmt = con.createStatement();
	    	
	    	 resultats = stmt.executeQuery(sql);
		    	//System.out.println(resultats);
	    	
	    	 } catch (SQLException e) { 	
	    	
	    	 }
	     //Pour vérifier si l'email existe déjà dans la base
	     if(!resultats.next())
	     {    	 		
		requete = "INSERT INTO agora.client_inscription (nom, prenom, adresse, ville, code_postal, telephone ,mail, login, password) VALUES ('" + nom + "', '"  + prenom + "', '" + adresse + "', '" + ville + "', '" + code_postal + "','" + telephone + "','" + mail + "', '" + login + "', '" + password + "')";
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
