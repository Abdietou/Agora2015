package Modele;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class DevisEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_devis_etabli")
	private Long id;
	private Date date_debut_travaux;
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
	@OneToOne 
	@JoinColumn(name="id_client_inscrit")
	private ClientInscritEntity client_demandeur;
	@OneToOne 
	@JoinColumn(name="id_ouvrier_inscrit")
	private OuvrierInscritEntity ouvrier_choisi;
	private Double prixTTC;
	private boolean accepter;
	
	public DevisEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public DevisEntity(Date date_debut_travaux, String domaine, String titre,
			String description, String delai, String budget, String adresse,
			String nom, String prenom, String mail, String telephone,
			ClientInscritEntity client_demandeur,
			OuvrierInscritEntity ouvrier_choisi, Double prixTTC) {
		super();
		this.date_debut_travaux = date_debut_travaux;
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
		this.client_demandeur = client_demandeur;
		this.ouvrier_choisi = ouvrier_choisi;
		this.prixTTC = prixTTC;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate_debut_travaux() {
		return date_debut_travaux;
	}

	public void setDate_debut_travaux(Date date_debut_travaux) {
		this.date_debut_travaux = date_debut_travaux;
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

	public ClientInscritEntity getClient_demandeur() {
		return client_demandeur;
	}

	public void setClient_demandeur(ClientInscritEntity client_demandeur) {
		this.client_demandeur = client_demandeur;
	}

	public OuvrierInscritEntity getOuvrier_choisi() {
		return ouvrier_choisi;
	}

	public void setOuvrier_choisi(OuvrierInscritEntity ouvrier_choisi) {
		this.ouvrier_choisi = ouvrier_choisi;
	}

	public Double getPrixTTC() {
		return prixTTC;
	}

	public void setPrixTTC(Double prixTTC) {
		this.prixTTC = prixTTC;
	}

	public boolean isAccepter() {
		return accepter;
	}

	public void setAccepter(boolean accepter) {
		this.accepter = accepter;
	}

	@Override
	public String toString() {
		return "DevisEntity [id=" + id + ", date_debut_travaux="
				+ date_debut_travaux + ", domaine=" + domaine + ", titre="
				+ titre + ", description=" + description + ", delai=" + delai
				+ ", budget=" + budget + ", adresse=" + adresse + ", nom="
				+ nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", telephone=" + telephone + ", client_demandeur="
				+ client_demandeur + ", ouvrier_choisi=" + ouvrier_choisi
				+ ", prixTTC=" + prixTTC + ", accepter=" + accepter + "]";
	}

	
	
	

}
