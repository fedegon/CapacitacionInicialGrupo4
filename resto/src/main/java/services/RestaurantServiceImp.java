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
		Restaurant resto=restaurantDao.findById(r.getIdRestaurant());
		try {
			resto.setName(r.getName());
			resto.setAddress(r.getAddress());
			resto.setPhone(r.getPhone());
			resto.setEmail(r.getEmail());
			restaurantDao.update(resto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteRestaurant(Restaurant r) {
		Restaurant resto=restaurantDao.findById(r.getIdRestaurant());
		try {
			restaurantDao.delete(resto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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
