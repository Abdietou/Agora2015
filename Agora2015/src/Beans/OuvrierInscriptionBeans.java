package Beans;

import java.util.ArrayList;

import Modele.OuvrierEntity;

public class OuvrierInscriptionBeans {
	
	private OuvrierEntity ouvrier = new OuvrierEntity();
	private ArrayList<OuvrierEntity> liste = new ArrayList<OuvrierEntity>();
	
	public OuvrierEntity getOuvrier() {
		return ouvrier;
	}
	public void setOuvrier(OuvrierEntity ouvrier) {
		this.ouvrier = ouvrier;
	}
	public ArrayList<OuvrierEntity> getListe() {
		return liste;
	}
	public void setListe(ArrayList<OuvrierEntity> liste) {
		this.liste = liste;
	}
	
	

}
