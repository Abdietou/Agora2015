package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;
import Modele.ClientInscriptionEntity;
import Modele.ClientInscritEntity;
import Modele.OuvrierInscriptionEntity;
import Modele.OuvrierInscritEntity;
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
	
	@Override
	public OuvrierInscriptionEntity getOuvrier(Long idOuv) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object ouv=session.get(OuvrierInscriptionEntity.class, idOuv);
		if(ouv==null) throw new RuntimeException("Ouvrier Introuvable");
		session.getTransaction().commit();
		return (OuvrierInscriptionEntity)ouv;
	}

	@Override
	public void deleteOuvrier(Long idOuv) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object o = session.get(OuvrierInscriptionEntity.class, idOuv);
		if(o==null) throw new RuntimeException("Ouvrier Introuvable");
		session.delete(o);
		session.getTransaction().commit();
	}

	@Override
	public List<OuvrierInscriptionEntity> listOuvrier() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("select o from OuvrierInscriptionEntity o");
		List<OuvrierInscriptionEntity> ouvrier=req.list();
		session.getTransaction().commit();
		return ouvrier;
	}

	@Override
	public void InscrireClient(ClientInscritEntity cl) {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(cl);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
	}

	@Override
	public void InscrireOuvrier(OuvrierInscritEntity ouv) {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(ouv);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
	}


}
