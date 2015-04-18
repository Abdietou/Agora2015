package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;
import Modele.ClientInscriptionEntity;
import Modele.DemandeDevisClientEntity;
import Modele.DevisEntity;
import Modele.InternauteEntity;
import Modele.OuvrierInscriptionEntity;
import Modele.OuvrierInscritEntity;
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

	@Override
	public void EditerDevis(DevisEntity d) {
		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(d);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		
	}

	@Override
	public List<OuvrierInscritEntity> listOuvrier() {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req=session.createQuery("select d from OuvrierInscritEntity d");
		List<OuvrierInscritEntity> devis=req.list();
		session.getTransaction().commit();
		return devis;
	}

	@Override
	public DemandeDevisClientEntity getDemDeviClient(Long id) {
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Object sc=session.get(DemandeDevisClientEntity.class, id);
		if(sc==null) throw new RuntimeException("Client Introuvable");
		session.getTransaction().commit();
		return (DemandeDevisClientEntity)sc;
	}

	@Override
	public void CreerDevis(DevisEntity dev) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(dev);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		
	}

}
