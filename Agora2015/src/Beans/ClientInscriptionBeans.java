package Beans;

import java.util.ArrayList;

import Modele.ClientInscriptionEntity;

public class ClientInscriptionBeans {
	
	private ClientInscriptionEntity client = new ClientInscriptionEntity();
	private ArrayList <ClientInscriptionEntity> liste = new ArrayList<ClientInscriptionEntity>();
	
	public ClientInscriptionEntity getClient() {
		return client;
	}
	public void setClient(ClientInscriptionEntity client) {
		this.client = client;
	}
	public ArrayList<ClientInscriptionEntity> getListe() {
		return liste;
	}
	public void setListe(ArrayList<ClientInscriptionEntity> liste) {
		this.liste = liste;
	}
	
	
	
	

}
