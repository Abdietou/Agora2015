package DAO_Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modele.ClientInscriptionEntity;

public class DAO_AgentAdmin {
	
	public ArrayList<ClientInscriptionEntity> demande_client = new ArrayList<ClientInscriptionEntity>();
	
	public ArrayList<ClientInscriptionEntity> getDemande_client() {
		return demande_client;
	}

	public void setDemande_client(ArrayList<ClientInscriptionEntity> demande_client) {
		this.demande_client = demande_client;
	}

	public void AfficherDemande(Connection con){
		ResultSet resultats = null;
		
		String sql = "SELECT * FROM client_inscritpion" ;
		try{
			Statement stmt = con.createStatement();	    	
	    	 resultats = stmt.executeQuery(sql);	
			
		} catch (SQLException e) {
			System.out.println("Anomalie lors de l'execution de la requête");
		}
		try{
			ResultSetMetaData rsmd = resultats.getMetaData();
			int nbCols = rsmd.getColumnCount();

			while (resultats.next()) {
				ClientInscriptionEntity demande_client = new ClientInscriptionEntity();
				
				demande_client.setId(resultats.getLong("id"));
				demande_client.setNom(resultats.getString("nom"));
				demande_client.setPrenom(resultats.getString("prenom"));
				demande_client.setAdresse(resultats.getString("adresse"));
				demande_client.setVille(resultats.getString("ville"));
				demande_client.setCode_postal(resultats.getString("code_postal"));
				demande_client.setTelephone(resultats.getString("telephone"));
				demande_client.setMail(resultats.getString("mail"));
				demande_client.setLogin(resultats.getString("login"));
				demande_client.setPassword(resultats.getString("password"));

			/*for (int i = 2; i <= nbCols; i++)
		
			System.out.print(resultats.getString(i) + "\t \t");
				System.out.println();*/
		
			}
		
			resultats.close();
		
			} catch (SQLException e) {
				//traitement de l'exception
			
		}
		
	}
	
	public void RefuserInscription(Connection con, Long id){
		String requete = "";
		
		requete = "DELETE from client_inscription WHERE id_client_inscription=" + id;
		
		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(requete);
			System.out.println("Demande d'inscription supprimé");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList getAll() {
		ArrayList liste_demande = new ArrayList<ClientInscriptionEntity>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agora","root", "");
			PreparedStatement pr = cn.prepareStatement("SELECT * FROM client_inscription ");
			ResultSet rs = pr.executeQuery();
			
			while (rs.next()) {
				ClientInscriptionEntity demande_client = new ClientInscriptionEntity();
				
				demande_client.setId(rs.getLong("id_client_inscription"));
				demande_client.setNom(rs.getString("nom"));
				demande_client.setPrenom(rs.getString("prenom"));
				demande_client.setAdresse(rs.getString("adresse"));
				demande_client.setVille(rs.getString("ville"));
				demande_client.setCode_postal(rs.getString("code_postal"));
				demande_client.setTelephone(rs.getString("telephone"));
				demande_client.setMail(rs.getString("mail"));
				demande_client.setLogin(rs.getString("login"));
				demande_client.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return liste_demande;
	}

}
