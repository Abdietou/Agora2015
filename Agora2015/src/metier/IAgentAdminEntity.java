package metier;

import java.util.List;

import Modele.ClientInscriptionEntity;

public interface IAgentAdminEntity {
	
	//public void addClient(ClientInscriptionEntity c); 
	public void deleteClient(Long idClient);
	public void updateClient(ClientInscriptionEntity c);
	public List<ClientInscriptionEntity> listClient();
	public ClientInscriptionEntity getClient(Long idClient);

}
