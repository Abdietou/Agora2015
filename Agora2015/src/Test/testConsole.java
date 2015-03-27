package Test;

import DAO.AgentAdminImpl;
import Modele.ClientInscriptionEntity;

public class testConsole {
	
	public static void main (String[] args) {
		AgentAdminImpl agent = new AgentAdminImpl();
		ClientInscriptionEntity c = agent.getClient(2L);
		agent.deleteClient(2L);
	}

}
