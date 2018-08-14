package services;

import model.Restaurant;

public interface RestaurantService {
	public long createRestaurant(Restaurant r);
	public Restaurant getRestaurantByID(long id);
	public void updateRestaurant(Restaurant r);
	public void deleteRestaurant(Restaurant r);
}
