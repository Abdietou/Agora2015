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
	 * Recherche une instance depuis la base de données à partir de l'identifiant
	 * 
	 * @param con
	 * @param id
	 * @return l'instance
	 * @throws SQLException
	 */
	
	public String conection(Connection con,String num,String motpass)
			throws SQLException {
		
		
		ResultSet resultats=null;
		PreparedStatement state = null;
		ResultSet resultat=null;
		 //String num=null;
		 Boolean var=null;
		 String var1=null;
		//Si employé est dans la base de données
		String sql = "SELECT  utilisateur.type_utilisateur  FROM utilisateur WHERE"
				+ " 	id_utilisateur = ?AND mot_depasse =? "  ;
	     try {
	    	 /*Statement stmt = con.createStatement();
	    	
	    	 resultats = stmt.executeQuery(sql);
		    	//System.out.println(resultats);*/
	    	 state=con.prepareStatement(sql);
	    	 
			
	    	 
	    	 state.setString(1,num );
	    	 state.setString(2,motpass);
	    	 //state.setString(3,prenom);
	    	 
	    	  resultat=state.executeQuery();
	    	 } catch (SQLException e) { 	
	    	
	    	 }
	     //l'employé n'est pas dans la base de données
	     if(resultat.next())
	     { 
	    	 String type_u=resultat.getString(resultat.findColumn("type_utilisateur"));
	    	 if(type_u.equals("employe"))
	    	 {
	    		 var1="1";
	    	 }
	    	 else if(type_u.equals("direction_moyens"))
	    	 		
	    	 {
	    		 var1="2";
	    	 }
	    	 
	     
	  
	    }
	     else
	     {
	    	 var1="3";
	    	 System.out.println("objet non trouvéE");
	    	//return false;
	     }
	     return var1;
	}

}
