package daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GenericDaoHibernate<T> implements GenericDao<T> {
	

	private Class<T> PersistentClass;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public<T> Serializable create(T entity){
		return sessionFactory.getCurrentSession().save(entity);
	}
	
	public void update(T entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	
	public GenericDaoHibernate(Class<T> entidad){
		PersistentClass=entidad;
	}

	public Class<T> getPersistentClass() {
		return PersistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		PersistentClass = persistentClass;
	}


	
	public void save(T entidad) {
		// TODO Auto-generated method stub
		EntityManager em = sessionFactory.getCurrentSession().getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx= em.getTransaction();
			tx.begin();
			em.persist(entidad);
			tx.commit();
		}
		catch (RuntimeException e){
			if (tx !=null && tx.isActive())tx.rollback();
			 throw e;
		}
		finally {em.close();}
	}
	
	public T persist(T entity) {
		sessionFactory.getCurrentSession().persist(entity);
		return entity;}
	
	
     
	
	
	@SuppressWarnings("unchecked")
	public List<T> toList(){		
		
		return new ArrayList();
	 }
	
	
	
	
	public T findById(int id){
		
		T resultado = (T)"hola";
		return resultado;
		
	}
	
	
	
	public void delete(T entity){
	
		
	}
	
	
	
	public void deleteAll(){
	
	}
	
	
	public T findByName(String nom){
		
		
		T resultado = (T)"hola";
		return resultado;
		
		
		
	}
		
	}