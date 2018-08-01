package daos;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Location;
@Repository
public class LocationDaoHibernate extends GenericDaoHibernate<Location> implements LocationDao {
		@Autowired
		//private HibernateUtil util;
		
		public LocationDaoHibernate() {
			// TODO Auto-generated constructor stub
			super(Location.class);//usa el constructor del dao generico public GenericDaoHibernate(Class<T> entidad)
		}
		
		@Override
		@Transactional
		 public void update(Location p) {
			this.update(p);
		}
		
		public Long createLocation(Location p) {
			this.save(p);
			Long aux=(long) 8909;
			return aux;
		}
		public Location mergeLocation(Location p) {
			return p;
		}

}

