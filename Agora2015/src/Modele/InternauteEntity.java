package Modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTERNAUTE_DEVIS")
public class InternauteEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_internaute_devis;
	private String domaine;
	private String titre;
	private String description;
	private String delai;
	private String budget;
	private String adresse;
	private String nom;
	private String prenom;
	private String mail;
	private String telephone;
	
	public InternauteEntity(String domaine, String titre, String description,
			String delai, String budget, String adresse, String nom,
			String prenom, String mail, String telephone) {
		super();
		this.domaine = domaine;
		this.titre = titre;
		this.description = description;
		this.delai = delai;
		this.budget = budget;
		this.adresse = adresse;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
	}

	public InternauteEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDelai() {
		return delai;
	}

	public void setDelai(String delai) {
		this.delai = delai;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "InternauteEntity [domaine=" + domaine + ", titre=" + titre
				+ ", description=" + description + ", delai=" + delai
				+ ", budget=" + budget + ", adresse=" + adresse + ", nom="
				+ nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", telephone=" + telephone + "]";
	}
	
	

}
