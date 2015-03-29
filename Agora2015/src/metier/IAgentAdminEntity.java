package metier;

import java.util.List;

import Modele.ClientInscriptionEntity;
import Modele.ClientInscritEntity;
import Modele.OuvrierInscriptionEntity;
import Modele.OuvrierInscritEntity;

public interface IAgentAdminEntity {
	
	//public void addClient(ClientInscriptionEntity c); 
	public void deleteClient(Long idClient);
	public void deleteOuvrier(Long idOuv);
	public void updateClient(ClientInscriptionEntity c);
	public void InscrireClient(ClientInscritEntity cl);
	public void InscrireOuvrier(OuvrierInscritEntity ouv);
	
	public List<ClientInscriptionEntity> listClient();
	public List<OuvrierInscriptionEntity> listOuvrier();
	public ClientInscriptionEntity getClient(Long idClient);
	public OuvrierInscriptionEntity getOuvrier(Long idOuv);

}
