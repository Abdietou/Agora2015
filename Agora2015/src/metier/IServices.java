package metier;

import Modele.AgentAdminEntity;
import Modele.ServiceComptableEntity;
import Modele.ServiceMarketingEntity;
import Modele.ServiceTechniqueEntity;

public interface IServices {
	
	public AgentAdminEntity getAdmin (String login);
	public ServiceTechniqueEntity getST(String login);
	public ServiceMarketingEntity getSM(String login);
	public ServiceComptableEntity getSC(String login);
	

}
