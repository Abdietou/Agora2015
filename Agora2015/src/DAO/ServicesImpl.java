package DAO;

import org.hibernate.Session;

import util.HibernateUtil;
import Modele.AgentAdminEntity;
import Modele.ClientInscriptionEntity;
import Modele.ServiceComptableEntity;
import Modele.ServiceMarketingEntity;
import Modele.ServiceTechniqueEntity;
import metier.IServices;

public class ServicesImpl implements IServices {

	@Override
	public AgentAdminEntity getAdmin(String login) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object agent=session.get(AgentAdminEntity.class, login);
		if(agent==null) throw new RuntimeException("Agent Introuvable");
		session.getTransaction().commit();
		return (AgentAdminEntity)agent;
	}

	@Override
	public ServiceTechniqueEntity getST(String login) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object st=session.get(ServiceTechniqueEntity.class, login);
		if(st==null) throw new RuntimeException("Service Technique Introuvable");
		session.getTransaction().commit();
		return (ServiceTechniqueEntity)st;
	}

	@Override
	public ServiceMarketingEntity getSM(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceComptableEntity getSC(String login) {
		// TODO Auto-generated method stub
		return null;
	}

}
