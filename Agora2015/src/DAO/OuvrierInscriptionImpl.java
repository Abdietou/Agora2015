package DAO;

import org.hibernate.Session;

import util.HibernateUtil;
import Modele.OuvrierInscriptionEntity;
import metier.IOuvrierInscription;

public class OuvrierInscriptionImpl implements IOuvrierInscription {

	@Override
	public void addOuvrier(OuvrierInscriptionEntity o) {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(o);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
	}
		
	}

