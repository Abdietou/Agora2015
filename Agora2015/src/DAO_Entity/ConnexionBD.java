package DAO_Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnexionBD {
	

	/**
	 * URL de connection
	 */
	private static String url = "jdbc:mysql://localhost:3306/agora"; //"jdbc:mysql://localhost:3306/agora"
	/**
	 * Nom du user
	 */
	private static String user = "root";
	/**
	 * Mot de passe du user
	 */
	private static String passwd = "";
	/**
	 * Objet Connection
	 */
	private static Connection connexion;

	/**
	 * Méthode qui va nous retourner notre instance
	 * et la créer si elle n'existe pas...
	 * @return
	 */
	public static Connection getInstance(){
		if(connexion == null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				connexion = (Connection) DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return connexion;	
	}	
	/**
	 * Vérifie la connexion au serveur
	 * 
	 * @return vrai si la connexion est valide
	 */
	public static boolean isValide() {
		if (connexion == null) {
			connexion = null;
			return false;
		}
		ResultSet teste = null;
		try {
			if (connexion.isClosed()) {
				connexion = null;
				return false;
			}
			teste = connexion.createStatement().executeQuery("SELECT 1");
			return teste.next();
		} catch (SQLException sql) {
			connexion = null;
			return false;
		} finally {
			if (teste != null) {
				try {
					teste.close();
				} catch (SQLException e) {
				}
			}
		}
	}

}
