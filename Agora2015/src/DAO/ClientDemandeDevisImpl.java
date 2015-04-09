package DAO;

import org.hibernate.Session;

import Modele.ClientInscritEntity;
import Modele.DemandeDevisClientEntity;
import util.HibernateUtil;
import metier.IClientDemandeDevis;

public class ClientDemandeDevisImpl implements IClientDemandeDevis {

	@Override
	public void addDevis(DemandeDevisClientEntity cl_dem_devis) {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(cl_dem_devis);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		
	}

	@Override
	public ClientInscritEntity getClient(Long id) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object cl_inscrit=session.get( ClientInscritEntity.class, id);
		if(cl_inscrit==null) throw new RuntimeException("Client inscrit introuvable");
		session.getTransaction().commit();
		return (ClientInscritEntity)cl_inscrit;
	}

}
