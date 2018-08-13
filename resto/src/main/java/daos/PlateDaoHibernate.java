package daos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Plate;
@Repository
public class PlateDaoHibernate implements PlateDao {
	@Autowired
	private HibernateUtil<Plate> util;
	
	public PlateDaoHibernate() {
		// TODO Auto-generated constructor stub
//usa el constructor del dao generico public GenericDaoHibernate(Class<T> entidad)
	}
	
	@Override
	@Transactional
	 public void update(Plate p) {
		
	}
	
	public Long createPlate(Plate p) {
		util.create(p);
		Long aux=(long) 8909;
		return aux;
	}
	public Plate mergePlate(Plate p) {
		return p;
	}

	@Override
	public void save(Plate tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Plate> toList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plate persist(Plate entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plate findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Plate entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Plate findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}