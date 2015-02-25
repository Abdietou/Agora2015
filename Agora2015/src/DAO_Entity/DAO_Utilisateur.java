package DAO_Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO_Utilisateur {
	
	private List<String> messages = new ArrayList<String>();
	/**
	 * Recherche une instance depuis la base de donn�es � partir de l'identifiant
	 * 
	 * @param con
	 * @param id
	 * @return l'instance
	 * @throws SQLException
	 */
	
	public String conection(Connection con,String login,String motpass)
			throws SQLException {
		
		
		ResultSet resultats=null;
		PreparedStatement state = null;
		ResultSet resultat=null;
		 //String num=null;
		 Boolean var=null;
		 String var1=null;
		//Si employ� est dans la base de donn�es
		String sql = "SELECT  utilisateur.type_utilisateur  FROM utilisateur WHERE"
				+ " 	login = ?AND mot_depasse =? "  ;
	     try {
	    	 /*Statement stmt = con.createStatement();
	    	
	    	 resultats = stmt.executeQuery(sql);
		    	//System.out.println(resultats);*/
	    	 state=con.prepareStatement(sql);
	    	 
			
	    	 
	    	 state.setString(1,login );
	    	 state.setString(2,motpass);
	    	 
	    	  resultat=state.executeQuery();
	    	 } catch (SQLException e) { 	
	    	
	    	 }
	     //l'employ� n'est pas dans la base de donn�es
	     if(resultat.next())
	     { 
	    	 String type_u=resultat.getString(resultat.findColumn("type_utilisateur"));
	    	 if(type_u.equals("agent_admin"))
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
	    	 System.out.println("objet non trouv�E");
	    	//return false;
	     }
	     return var1;
	}

}
