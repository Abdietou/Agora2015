package Beans;

import java.util.ArrayList;

import Modele.OuvrierInscriptionEntity;

public class OuvrierInscriptionBeans {
	
	private OuvrierInscriptionEntity ouvrier = new OuvrierInscriptionEntity();
	private ArrayList<OuvrierInscriptionEntity> liste = new ArrayList<OuvrierInscriptionEntity>();
	
	public OuvrierInscriptionEntity getOuvrier() {
		return ouvrier;
	}
	public void setOuvrier(OuvrierInscriptionEntity ouvrier) {
		this.ouvrier = ouvrier;
	}
	public ArrayList<OuvrierInscriptionEntity> getListe() {
		return liste;
	}
	public void setListe(ArrayList<OuvrierInscriptionEntity> liste) {
		this.liste = liste;
	}
	
	

}
