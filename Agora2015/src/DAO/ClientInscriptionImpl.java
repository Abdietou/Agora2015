package DAO;

import org.hibernate.Session;

import util.HibernateUtil;
import Modele.ClientInscriptionEntity;
import metier.IClientInscriptionEntity;

public class ClientInscriptionImpl implements  IClientInscriptionEntity{

	@Override
	public void addClient(ClientInscriptionEntity cl) {
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

}
