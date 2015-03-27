package Modele;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT_INSCRIPTION")
public class OuvrierInscriptionEntity implements Serializable {
	
	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private Integer note ;
	private DisponibiliteEntity disponibilite;
	private String prestation;
	private double prix;
	
	
	
}
