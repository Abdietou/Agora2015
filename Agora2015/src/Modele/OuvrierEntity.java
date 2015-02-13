package Modele;

public class OuvrierEntity {
	
	private String ID;
	private String Nom;
	private String Prenom;
	private String Login;
	private String Password;
	private Integer Note ;
	private boolean Active ;
	private DisponibiliteEntity disponibilite;
	private PrestationEntity prestation;
	private PrixEntity prix;

}
