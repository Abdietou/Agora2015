package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;
import Modele.ClientInscriptionEntity;
import metier.IAgentAdminEntity;

public class AgentAdminImpl implements IAgentAdminEntity {

	@Override
	public void addClient() {
		
		
	}

	@Override
	public void deleteClient(Long idClient) {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object cl=session.get(ClientInscriptionEntity.class, idClient);
		if(cl==null) throw new RuntimeException("Client Introuvable");
		session.delete(cl);
		session.getTransaction().commit();
	}

	@Override
	public void updateClient(ClientInscriptionEntity cl) {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(cl);
		session.getTransaction().commit();
	}

	@Override
	public List<ClientInscriptionEntity> listClient() {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("select cl from client_inscription cl");
		List<ClientInscriptionEntity> client=req.list();
		session.getTransaction().commit();
		return client;
	}

	@Override
	public ClientInscriptionEntity getClient(Long idClient) { //consulter un demande d'inscription
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object cl=session.get(ClientInscriptionEntity.class, idClient);
		if(cl==null) throw new RuntimeException("Client Introuvable");
		session.getTransaction().commit();
		return (ClientInscriptionEntity)cl;
	}

}
