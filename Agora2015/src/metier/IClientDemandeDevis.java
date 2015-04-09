package metier;

import Modele.ClientInscritEntity;
import Modele.DemandeDevisClientEntity;

public interface IClientDemandeDevis {
	
	public void addDevis(DemandeDevisClientEntity dem_client);
	public ClientInscritEntity getClient(Long id);

}
