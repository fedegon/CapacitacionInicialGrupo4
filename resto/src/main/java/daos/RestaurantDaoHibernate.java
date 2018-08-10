package daos;

import java.util.List;

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
	public Restaurant findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Restaurant entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Restaurant entity) {
		// TODO Auto-generated method stub

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

}
