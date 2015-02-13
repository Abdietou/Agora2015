package Modele;

public class ClientEntity {
	//mettre tous les attribut en minuscule
	
	private String ID;
	private String Nom;
	private String Prenom;
	private String Adresse;
	private int CP;
	private String Ville;
	private String Telephone;
	private String Mail;
	private String Login;
	private String Password;
	
	public ClientEntity(String iD, String nom, String prenom, String adresse,
			int cP, String ville, String telephone, String mail, String login,
			String password) {
		super();
		ID = iD;
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		CP = cP;
		Ville = ville;
		Telephone = telephone;
		Mail = mail;
		Login = login;
		Password = password;
	}

	public ClientEntity(String nom, String prenom, String adresse, int cP,
			String ville, String telephone, String mail, String login,
			String password) {
		super();
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		CP = cP;
		Ville = ville;
		Telephone = telephone;
		Mail = mail;
		Login = login;
		Password = password;
	}

	public ClientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "ClientEntity [ID=" + ID + ", Nom=" + Nom + ", Prenom=" + Prenom
				+ ", Adresse=" + Adresse + ", CP=" + CP + ", Ville=" + Ville
				+ ", Telephone=" + Telephone + ", Mail=" + Mail + ", Login="
				+ Login + ", Password=" + Password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Login == null) ? 0 : Login.hashCode());
		result = prime * result
				+ ((Password == null) ? 0 : Password.hashCode());
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
		ClientEntity other = (ClientEntity) obj;
		if (Login == null) {
			if (other.Login != null)
				return false;
		} else if (!Login.equals(other.Login))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		return true;
	}
	
	

}
