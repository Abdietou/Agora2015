package Modele;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SERVICE_TECHNIQUE")
public class ServiceTechniqueEntity implements Serializable {
	
	@Id
	private String login;
	private String password;
	

	public ServiceTechniqueEntity(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public ServiceTechniqueEntity() {
		super();
		// TODO Auto-generated constructor stub
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
		return "ServiceTechniqueEntity [login=" + login + ", password="
				+ password + "]";
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
		ServiceTechniqueEntity other = (ServiceTechniqueEntity) obj;
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
