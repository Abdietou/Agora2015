package metier;

import java.util.List;

import Modele.ClientInscriptionEntity;

public interface IAgentAdminEntity {
	
	public void addClient(ClientInscriptionEntity cl); // voir par�s ce que je mets en param�tre dans le add pour inscrire un client
	public void deleteClient(Long idClient);
	public void updateClient(ClientInscriptionEntity cl);
	public List<ClientInscriptionEntity> listClient();
	public ClientInscriptionEntity getClient(Long idClient);

}
