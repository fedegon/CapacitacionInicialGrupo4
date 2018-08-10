package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.RestaurantDao;
import model.Restaurant;
@Service
public class RestaurantServiceImp implements RestaurantService {
	
	@Autowired
	private RestaurantDao restaurantDao;
	@Override
	public long createRestaurant(Restaurant r) {
		// TODO Auto-generated method stub
		return restaurantDao.createRestaurant(r);
	}

}
