package DAO_Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO_Utilisateur {
	
	private List<String> messages = new ArrayList<String>();
	/**
	 * Recherche une instance depuis la base de données à partir de l'identifiant
	 * 
	 * @param con
	 * @param id
	 * @return l'instance
	 * @throws SQLException
	 */
	
	public void getObjet(Connection con, String login)
	{
	ResultSet resultats=null;
	
	String sql = "SELECT * FROM utilisateur_systeme WHERE login = "+ login ;
     try {
    	 Statement stmt = con.createStatement();	    	
    	 resultats = stmt.executeQuery(sql);	    	
    	 } 
     catch (SQLException e) {
    	
    	System.out.println("Anomalie lors de l'execution de la requête");
    	
    	 }
	try {

		ResultSetMetaData rsmd = resultats.getMetaData();
		int nbCols = rsmd.getColumnCount();

		while (resultats.next()) {

		for (int i = 2; i <= nbCols; i++)
	
		System.out.print(resultats.getString(i) + " ");
			System.out.println();
	
		}
	
		resultats.close();
	
		} catch (SQLException e) {
	
		//traitement de l'exception
	
		}
}
	
	public String conection(Connection con,String login,String password)
			throws SQLException {
		
		
		ResultSet resultats=null;
		PreparedStatement state = null;
		ResultSet resultat=null;
		 //String num=null;
		 //Boolean var=null;
		 String var1=null;
		//Si employé est dans la base de données
		String sql = "SELECT  * FROM utilisateur_systeme WHERE"
				+ " 	login = ? AND password =? "  ;
	     try {
	    	 /*Statement stmt = con.createStatement();
	    	
	    	 resultats = stmt.executeQuery(sql);
		    	//System.out.println(resultats);*/
	    	 state=con.prepareStatement(sql);
	    	 
			
	    	 
	    	 state.setString(1,login );
	    	 state.setString(2,password);
	    	 
	    	 
	    	  resultat=state.executeQuery();
	    	  
	    	  
	    	 } catch (SQLException e) { 	
	    	
	    	 }
	     //l'employé n'est pas dans la base de données
	     if(resultat.next())
	     { 
	    	 String type_u=resultat.getString(resultat.findColumn("login"));
	    	 if(type_u.equals("admin"))
	    	 {
	    		 var1="1";
	    		 
	    	 }
	    	 else if(type_u.equals("service_technique"))
	    	 		
	    	 {
	    		 var1="2";
	    	 }
	    	 
	    	 else if(type_u.equals("service_comptable"))
	    	 		
	    	 {
	    		 var1="3";
	    	 }
	    	 
	    	 else if(type_u.equals("service_marketing"))
	    	 		
	    	 {
	    		 var1="4";
	    	 }
	  
	    }
	     else
	     {
	    	 var1="5";
	    	 System.out.println("objet non trouvé");
	    	//return false;
	    	 System.out.println( "valeur " + var1);
	     }
	     return var1;
	    
	}

}
