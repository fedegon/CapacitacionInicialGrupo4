package dto;

import model.Restaurant;

public class RestaurantTransferAtDTO {
	
	public static RestaurantDTO transferAtDTO(Restaurant r) {
		return new RestaurantDTO(r.getIdRestaurant(),r.getName(),r.getEmail(),r.getPhone(),r.getAddress());
	}
}
