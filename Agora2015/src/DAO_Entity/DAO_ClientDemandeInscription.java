package DAO_Entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO_ClientDemandeInscription {
	
	public void AfficherDemande(Connection con){
		ResultSet resultats = null;
		
		String sql = "SELECT * FROM client_inscritpion" ;
		try{
			Statement stmt = con.createStatement();	    	
	    	 resultats = stmt.executeQuery(sql);	
			
		} catch (SQLException e) {
			System.out.println("Anomalie lors de l'execution de la requ�te");
		}
		try{
			ResultSetMetaData rsmd = resultats.getMetaData();
			int nbCols = rsmd.getColumnCount();

			while (resultats.next()) {

			for (int i = 2; i <= nbCols; i++)
		
			System.out.print(resultats.getString(i) + "\t \t");
				System.out.println();
		
			}
		
			resultats.close();
		
			} catch (SQLException e) {
				//traitement de l'exception
			
		}
		
	}

}
