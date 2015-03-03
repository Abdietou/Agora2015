package Beans;

import java.util.ArrayList;

import Modele.ClientInscriptionEntity;

public class ClientInscriptionBeans {
	
	private ClientInscriptionEntity demande_inscription = new ClientInscriptionEntity();
	private ArrayList <ClientInscriptionEntity> liste_demande_inscription = new ArrayList<ClientInscriptionEntity>();
	
	public ClientInscriptionEntity getDemande_inscription() {
		return demande_inscription;
	}
	public void setDemande_inscription(ClientInscriptionEntity demande_inscription) {
		this.demande_inscription = demande_inscription;
	}
	public ArrayList<ClientInscriptionEntity> getListe_demande_inscription() {
		return liste_demande_inscription;
	}
	public void setListe_demande_inscription(ArrayList liste_demande_inscription) {
		this.liste_demande_inscription = liste_demande_inscription;
	}
	
	

}
