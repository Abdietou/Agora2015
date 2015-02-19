package Modele;

import java.util.List;

public class OuvrierEntity {
	
	private String ID;
	private String Nom;
	private String Prenom;
	private String Login;
	private String Password;
	private Integer Note ;
	private boolean Active ;
	private DisponibiliteEntity disponibilite;
	List <PrestationEntity> prestation;
	List<PrixEntity> prix;
	
	

}
