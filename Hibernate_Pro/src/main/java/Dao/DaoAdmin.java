package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Administr;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;


public class DaoAdmin implements ItDao<Administr>{
	 EntityManagerFactory EMF=Persistence.createEntityManagerFactory("connection");
	@Override
	public void save(Administr admin) {
		EntityManager EM=EMF.createEntityManager();
		EntityTransaction ET=EM.getTransaction();
		 if (admin.getId()==null){
	            EM.persist(admin);
	        }else {
	            EM.merge(admin);
	        }

	        ET.begin();
	        ET.commit();
	}

	@Override
	public Administr show(Long id) {
		 
		EntityManager EM=EMF.createEntityManager();
		return EM.find(Administr.class, id);
	}

	@Override
	public void delete(Long id) {
		// supprimer un Administrateur par son ID
		 EntityManager EM = EMF.createEntityManager();
	        EntityTransaction tx = EM.getTransaction();
	        tx.begin();
	        EM.remove(EM.find(Administr.class,id));
	        tx.commit();
	        System.out.println("L'administarteur ayant l'id "+id +" a été supprimé");	
		
	}

	@Override
	public List<Administr> find_ALL() {
		//consulter la liste des  administrateurs
		EntityManager entityManager = EMF.createEntityManager();
			Query query=entityManager.createQuery("select admin from Administr admin");
		
		
		return query.getResultList() ;
	}

	@Override
	public void update(Long id) {
		//mise a jour 
		EntityManager entityManager = EMF.createEntityManager();
		 EntityTransaction tx = entityManager.getTransaction();
		 tx.begin();
		entityManager.merge(id);
	}

	

}
