package daos;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Plate;
@Repository
public class PlateDaoHibernate extends GenericDaoHibernate<Plate> implements PlateDao {
	@Autowired
	private HibernateUtil util;
	
	public PlateDaoHibernate() {
		// TODO Auto-generated constructor stub
		super(Plate.class);//usa el constructor del dao generico public GenericDaoHibernate(Class<T> entidad)
	}
	
	@Override
	@Transactional
	 public void update(Plate p) {
		util.update(p);
	}
	
	public Long createPlate(Plate p) {
		Long aux=(long) 8909;
		return aux;
	}
	public Plate mergePlate(Plate p) {
		return p;
	}

}