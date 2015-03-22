package Modele;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ClientInscritEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_client_inscrit;
	private String nom;
	private String prenom;
	private String adresse;
	private int code_postal;
	private String ville;
	private String telephone;
	private String mail;
	private String login;
	private String password;
	
	
	public ClientInscritEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientInscritEntity(Long id_client_inscrit, String nom,
			String prenom, String adresse, int code_postal, String ville,
			String telephone, String mail, String login, String password) {
		super();
		this.id_client_inscrit = id_client_inscrit;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.ville = ville;
		this.telephone = telephone;
		this.mail = mail;
		this.login = login;
		this.password = password;
	}

	public ClientInscritEntity(String nom, String prenom, String adresse,
			int code_postal, String ville, String telephone, String mail,
			String login, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.ville = ville;
		this.telephone = telephone;
		this.mail = mail;
		this.login = login;
		this.password = password;
	}

	public Long getId_client_inscrit() {
		return id_client_inscrit;
	}

	public void setId_client_inscrit(Long id_client_inscrit) {
		this.id_client_inscrit = id_client_inscrit;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

	@Override
	public String toString() {
		return "ClientInscritEntity [id_client_inscrit=" + id_client_inscrit
				+ ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", code_postal=" + code_postal + ", ville=" + ville
				+ ", telephone=" + telephone + ", mail=" + mail + ", login="
				+ login + ", password=" + password + "]";
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
		ClientInscritEntity other = (ClientInscritEntity) obj;
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
	
	
	
}
