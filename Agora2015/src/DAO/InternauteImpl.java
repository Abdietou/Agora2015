package DAO;

import org.hibernate.Session;

import util.HibernateUtil;
import Modele.InternauteEntity;
import metier.InterInternate;

public class InternauteImpl implements InterInternate {

	@Override
	public void addDemande(InternauteEntity inter) {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(inter);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
	}
		
	}

