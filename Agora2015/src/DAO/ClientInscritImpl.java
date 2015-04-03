package DAO;

import org.hibernate.Session;

import util.HibernateUtil;
import Modele.ClientInscritEntity;
import metier.IClientInscrit;

public class ClientInscritImpl implements IClientInscrit{

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
