package daos;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Plate;
import model.Restaurant;
@Repository
public class RestaurantDaoHibernate implements RestaurantDao {

	@Autowired
	private HibernateUtil<Restaurant> util;
	
	@Override
	public void save(Restaurant tipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Restaurant> toList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant persist(Restaurant entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Restaurant findById(long id) {
		return util.getElement(Restaurant.class, id);
	}
	@Override
	@Transactional
	public void update(Restaurant entity) {
		util.update(entity);

	}

	@Override
	@Transactional
	public void delete(Restaurant entity) {
		util.delete(entity);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public Restaurant findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long createRestaurant(Restaurant r) {
		util.create(r);
		Long aux=(long) 8909;
		return aux;
	}

	@Override
	@Transactional
	public List<Restaurant> getFirstTenRestaurant() {
		return util.getElements(Restaurant.class, 10);
	}

}
