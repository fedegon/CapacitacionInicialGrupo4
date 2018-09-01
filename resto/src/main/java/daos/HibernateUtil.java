package daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class HibernateUtil<T> {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public HibernateUtil() {
		// TODO Auto-generated constructor stub

	}
	@Transactional
	public <T> Serializable create(T entity) {
		return sessionFactory.getCurrentSession().save(entity);
	}
	
	public <T> T getElement(Class<T> entityClass, long id) {
		return sessionFactory.getCurrentSession().get(entityClass, id);
	}
	public List<T> getElements(Class<T> entityClass, int count) {
		String query="SELECT r FROM "+this.formatClass(entityClass.getName()+" r ");
		System.out.println(query);
		try {
			//System.out.println(sessionFactory.getCurrentSession().createQuery("SELECT r FROM Restaurant r"));
		}catch(HibernateException he) {
			System.out.println(he.getMessage());
		}
		return sessionFactory.getCurrentSession().createQuery(query).setMaxResults(count).list();
	}
	public void update(T entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
	public void delete(T entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	public void merge(T entity) {
		sessionFactory.getCurrentSession().merge(entity);
	}
	private String formatClass(String value) {
		return value.substring(6);
	}
}