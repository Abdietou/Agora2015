package Modele;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
@Table(name = "DEVIS")

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
	/**
     * Client qui a fait la demande de devis
     */
	@OneToOne (fetch = FetchType.LAZY)
	@JoinTable(name = "client_inscrit",
	joinColumns = {
@JoinColumn(name="id_devis_etabli", unique=true)
	},
	inverseJoinColumns = {
    @JoinColumn(name="id_client_inscrit")
}
)
	private ClientInscritEntity id_client_inscrit;
	/**
     * Liste des ouvriers inscrit
     */
	@OneToOne (fetch = FetchType.LAZY)
	@JoinTable(name = "ouvrier_inscrit",
			joinColumns = {
	@JoinColumn(name="id_devis_etabli", unique=true)
			},
			inverseJoinColumns = {
            @JoinColumn(name="id_ouvrier_inscrit")
        }
    )
	private OuvrierInscritEntity ouvrier_choisi;
	
	private Double prixTTC;
	private boolean accepter;
	
	public DevisEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DevisEntity(String domaine, String titre, String description,
			String delai, String budget, String adresse, String nom,
			String prenom, String mail, String telephone,
			ClientInscritEntity id_client_inscrit,
			OuvrierInscritEntity ouvrier_choisi, Double prixTTC) {
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
		this.id_client_inscrit = id_client_inscrit;
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

	public ClientInscritEntity getId_client_inscrit() {
		return id_client_inscrit;
	}

	public void setId_client_inscrit(ClientInscritEntity id_client_inscrit) {
		this.id_client_inscrit = id_client_inscrit;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((id_client_inscrit == null) ? 0 : id_client_inscrit
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DevisEntity other = (DevisEntity) obj;
		if (id_client_inscrit == null) {
			if (other.id_client_inscrit != null)
				return false;
		} else if (!id_client_inscrit.equals(other.id_client_inscrit))
			return false;
		return true;
	}

	

	
	
	

}
