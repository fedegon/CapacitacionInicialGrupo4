package services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.RestaurantDao;
import dto.RestaurantDTO;
import dto.RestaurantTransferAtDTO;
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

	@Override
	public RestaurantDTO getRestaurantByID(long id) {
		// TODO Auto-generated method stub
		System.out.println(restaurantDao.findById(id));
		return RestaurantTransferAtDTO.transferAtDTO(restaurantDao.findById(id));
	}

	@Override
	public void updateRestaurant(Restaurant r) {
		restaurantDao.update(r);
	}

	@Override
	public void deleteRestaurant(Restaurant r) {
		restaurantDao.delete(r);
	}

	@Override
	public ArrayList<RestaurantDTO> getFirstTenRestaurant() {
		// TODO Auto-generated method stub
		ArrayList<RestaurantDTO> listDTO = new ArrayList<>();
		for (Restaurant resto : restaurantDao.getFirstTenRestaurant()) {
			listDTO.add(RestaurantTransferAtDTO.transferAtDTO(resto));
		}
		return listDTO;
	}

}
