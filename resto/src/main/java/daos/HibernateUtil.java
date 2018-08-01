package daos;

import java.io.Serializable;

import javax.transaction.Transactional;

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

	public void update(T entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
}