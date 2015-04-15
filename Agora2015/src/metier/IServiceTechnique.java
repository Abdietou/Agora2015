package metier;

import java.util.List;

import Modele.DemandeDevisClientEntity;
import Modele.DevisEntity;
import Modele.InternauteEntity;
import Modele.OuvrierInscritEntity;

public interface IServiceTechnique {
	
	public List <InternauteEntity> listInternauteDevis();
	public List <DemandeDevisClientEntity> listDevisClient();
	public void EditerDevis (DevisEntity d);
	public List <OuvrierInscritEntity> listOuvrier();
	public DemandeDevisClientEntity getDemDeviClient(Long id);
	public void CreerDevis(DevisEntity devis);

}
