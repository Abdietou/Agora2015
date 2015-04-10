package metier;

import java.util.List;

import Modele.DemandeDevisClientEntity;
import Modele.InternauteEntity;

public interface IServiceTechnique {
	
	public List <InternauteEntity> listInternauteDevis();
	public List <DemandeDevisClientEntity> listDevisClient();

}
