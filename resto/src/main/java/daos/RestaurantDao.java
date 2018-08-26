package daos;

import java.util.ArrayList;
import java.util.List;

import model.Restaurant;

public interface RestaurantDao extends GenericDao<Restaurant> {
	public long createRestaurant(Restaurant r);
	public List<Restaurant> getFirstTenRestaurant(); 
}
