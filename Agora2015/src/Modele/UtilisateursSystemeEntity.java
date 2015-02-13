package Modele;

public abstract class UtilisateursSystemeEntity {
	
	private String Login;
	private String Password;
	
	public UtilisateursSystemeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UtilisateursSystemeEntity(String login, String password) {
		super();
		Login = login;
		Password = password;
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
		UtilisateursSystemeEntity other = (UtilisateursSystemeEntity) obj;
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

	@Override
	public String toString() {
		return "UtilisateursSystemeEntity [Login=" + Login + ", Password="
				+ Password + "]";
	}
	
	

}
