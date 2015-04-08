package DAO;

import org.hibernate.Session;

import util.HibernateUtil;
import Modele.OuvrierInscritEntity;
import metier.IOuvrierInscrit;

public class OuvrierInscritImpl implements IOuvrierInscrit {

	@Override
	public OuvrierInscritEntity getOuvrier(Long id) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object ouv_inscrit=session.get( OuvrierInscritEntity.class, id);
		if(ouv_inscrit==null) throw new RuntimeException("Ouvrier inscrit introuvable");
		session.getTransaction().commit();
		return (OuvrierInscritEntity)ouv_inscrit;
	}

	@Override
	public void UpdateInfo(OuvrierInscritEntity ouv) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(ouv);
		session.getTransaction().commit();
		
	}

}
