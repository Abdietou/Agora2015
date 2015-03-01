package Beans;

import java.util.ArrayList;

import Modele.ClientIncriptionEntity;

public class ClientIncriptionBeans {
	
	private ClientIncriptionEntity demande_inscription = new ClientIncriptionEntity();
	private ArrayList <ClientIncriptionEntity> liste_demande_inscription = new ArrayList<ClientIncriptionEntity>();
	
	public ClientIncriptionEntity getDemande_inscription() {
		return demande_inscription;
	}
	public void setDemande_inscription(ClientIncriptionEntity demande_inscription) {
		this.demande_inscription = demande_inscription;
	}
	public ArrayList<ClientIncriptionEntity> getListe_demande_inscription() {
		return liste_demande_inscription;
	}
	public void setListe_demande_inscription(
			ArrayList<ClientIncriptionEntity> liste_demande_inscription) {
		this.liste_demande_inscription = liste_demande_inscription;
	}
	
	

}
