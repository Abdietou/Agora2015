package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;
import Modele.DemandeDevisClientEntity;
import Modele.InternauteEntity;
import metier.IServiceTechnique;

public class ServiceTechniqueImpl implements IServiceTechnique {

	@Override
	public List<InternauteEntity> listInternauteDevis() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("select i from InternauteEntity i");
		List<InternauteEntity> interaute=req.list();
		session.getTransaction().commit();
		return interaute;
	}

	@Override
	public List<DemandeDevisClientEntity> listDevisClient() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("select c from DemandeDevisClientEntity c");
		List<DemandeDevisClientEntity> client=req.list();
		session.getTransaction().commit();
		return client;
	}

}
