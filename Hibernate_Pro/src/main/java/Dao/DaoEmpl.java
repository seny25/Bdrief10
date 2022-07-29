package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;

import Model.Employe;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DaoEmpl implements ItDao<Employe> {
 EntityManagerFactory EMF=Persistence.createEntityManagerFactory("connection");
	@Override
	public void save(Employe employe) {
		EntityManager EM=EMF.createEntityManager();
		EntityTransaction ET=EM.getTransaction();
		 if (employe.getId()==null){
	            EM.persist(employe);
		 }else {
	            EM.merge(employe);
	        }

		 ET.begin();
		 ET.commit();
	    }
	

	@Override
	public Employe show(Long id) {
		EntityManager EM=EMF.createEntityManager();
		return EM.find(Employe.class,id);
	}

	@Override
	public void delete(Long id) {
		EntityManager EM=EMF.createEntityManager();
		EntityTransaction tx = EM.getTransaction();
        tx.begin();
        EM.remove(EM.find(Employe.class,id));
        tx.commit();
        System.out.println("L'employé ayant l'id "+id +" a été supprimé");
		
	}


	@Override
	public List<Employe> find_ALL() {
		
		EntityManager entityManager=EMF.createEntityManager();
	
			Query query= (Query) entityManager.createQuery("select employe from Employe employe");
			
			
			return query.getResultList();
		
		
	     
		}


	@Override
	public void update(Long id) {
		EntityManager entityManager = EMF.createEntityManager();
		 EntityTransaction tx = entityManager.getTransaction();
		entityManager.merge(id);
		
	}
		
		
		
	}


