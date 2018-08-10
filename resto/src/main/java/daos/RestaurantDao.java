package daos;

import model.Restaurant;

public interface RestaurantDao extends GenericDao<Restaurant> {
	public long createRestaurant(Restaurant r);
}
