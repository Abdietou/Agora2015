package metier;

import java.util.List;

import Modele.ClientInscriptionEntity;

public interface IAgentAdminEntity {
	
	public void addClient(ClientInscriptionEntity cl); // voir parès ce que je mets en paramètre dans le add pour inscrire un client
	public void deleteClient(Long idClient);
	public void updateClient(ClientInscriptionEntity cl);
	public List<ClientInscriptionEntity> listClient();
	public ClientInscriptionEntity getClient(Long idClient);

}
