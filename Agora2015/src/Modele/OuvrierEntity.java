package Modele;

import java.util.List;

public class OuvrierEntity {
	
	private String id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private Integer note ;
	private DisponibiliteEntity disponibilite;
	List <PrestationEntity> prestation;
	List<PrixEntity> prix;
	
	public OuvrierEntity(String id, String nom, String prenom, String login,
			String password, Integer note, DisponibiliteEntity disponibilite,
			List<PrestationEntity> prestation, List<PrixEntity> prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.note = note;
		this.disponibilite = disponibilite;
		this.prestation = prestation;
		this.prix = prix;
	}

	public OuvrierEntity(String nom, String prenom, String login,
			String password, Integer note, DisponibiliteEntity disponibilite,
			List<PrestationEntity> prestation, List<PrixEntity> prix) {
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

	public OuvrierEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public DisponibiliteEntity getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(DisponibiliteEntity disponibilite) {
		this.disponibilite = disponibilite;
	}

	public List<PrestationEntity> getPrestation() {
		return prestation;
	}

	public void setPrestation(List<PrestationEntity> prestation) {
		this.prestation = prestation;
	}

	public List<PrixEntity> getPrix() {
		return prix;
	}

	public void setPrix(List<PrixEntity> prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "OuvrierEntity [id=" + id + ", nom=" + nom + ", prenom="
				+ prenom + ", login=" + login + ", password=" + password
				+ ", note=" + note + ", disponibilite=" + disponibilite
				+ ", prestation=" + prestation + ", prix=" + prix + "]";
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
		OuvrierEntity other = (OuvrierEntity) obj;
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
