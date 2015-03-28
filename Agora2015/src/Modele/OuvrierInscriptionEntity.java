package Modele;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OUVRIER_INSCRIPTION")
public class OuvrierInscriptionEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ouvrier_inscription")
	private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private Integer note ;
	private Date disponibilite;
	private String prestation;
	private double prix;
	
	public OuvrierInscriptionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OuvrierInscriptionEntity(String nom, String prenom, String login,
			String password, Integer note, Date disponibilite,
			String prestation, double prix) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.note = note;
		this.disponibilite = disponibilite;
		this.prestation = prestation;
		this.prix = prix;
	}



	public OuvrierInscriptionEntity(String nom, String prenom, String login,
			String password, Date disponibilite, String prestation, double prix) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.disponibilite = disponibilite;
		this.prestation = prestation;
		this.prix = prix;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public Date getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(Date disponibilite) {
		this.disponibilite = disponibilite;
	}

	public String getPrestation() {
		return prestation;
	}

	public void setPrestation(String prestation) {
		this.prestation = prestation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
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
		OuvrierInscriptionEntity other = (OuvrierInscriptionEntity) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OuvrierInscriptionEntity [id=" + id + ", nom=" + nom
				+ ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", note=" + note + ", disponibilite="
				+ disponibilite + ", prestation=" + prestation + ", prix="
				+ prix + "]";
	}
	
	
	
	
}
