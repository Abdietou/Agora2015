package metier;

import java.util.List;

import Modele.ClientInscriptionEntity;
import Modele.OuvrierInscriptionEntity;

public interface IAgentAdminEntity {
	
	//public void addClient(ClientInscriptionEntity c); 
	public void deleteClient(Long idClient);
	public void deleteOuvrier(Long idOuv);
	public void updateClient(ClientInscriptionEntity c);
	public List<ClientInscriptionEntity> listClient();
	public List<OuvrierInscriptionEntity> listOuvrier();
	public ClientInscriptionEntity getClient(Long idClient);

}
