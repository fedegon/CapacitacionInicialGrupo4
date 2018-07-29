package daos;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class HibernateUtil<T>{

	@Autowired
	private SessionFactory sessionFactory;
	
	public HibernateUtil() {
		// TODO Auto-generated constructor stub
	
	}
	
	public<T> Serializable create(T entity){
		return sessionFactory.getCurrentSession().save(entity);
	}
	
	public void update(T entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
}