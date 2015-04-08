package metier;

import Modele.OuvrierInscritEntity;

public interface IOuvrierInscrit {
	
	public OuvrierInscritEntity getOuvrier(Long id);
	public void UpdateInfo(OuvrierInscritEntity ouv);

}
