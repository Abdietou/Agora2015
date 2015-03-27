package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;
import Modele.ClientInscriptionEntity;
import metier.IAgentAdminEntity;

public class AgentAdminImpl implements IAgentAdminEntity {


	@Override
	public void deleteClient(Long idClient) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object c=session.get(ClientInscriptionEntity.class, idClient);
		if(c==null) throw new RuntimeException("Client Introuvable");
		session.delete(c);
		session.getTransaction().commit();
	}

	@Override
	public void updateClient(ClientInscriptionEntity c) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(c);
		session.getTransaction().commit();
	}

	@Override
	public List<ClientInscriptionEntity> listClient() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("select c from ClientInscriptionEntity c");
		List<ClientInscriptionEntity> client=req.list();
		session.getTransaction().commit();
		return client;
	}

	@Override
	public ClientInscriptionEntity getClient(Long idClient) { //consulter un demande d'inscription
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object cl=session.get(ClientInscriptionEntity.class, idClient);
		if(cl==null) throw new RuntimeException("Client Introuvable");
		session.getTransaction().commit();
		return (ClientInscriptionEntity)cl;
	}

}
