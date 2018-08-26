package services;

import java.util.ArrayList;

import dto.RestaurantDTO;
import model.Restaurant;

public interface RestaurantService {
	public long createRestaurant(Restaurant r);
	public RestaurantDTO getRestaurantByID(long id);
	public void updateRestaurant(Restaurant r);
	public void deleteRestaurant(Restaurant r);
	public ArrayList<RestaurantDTO> getFirstTenRestaurant();
}
