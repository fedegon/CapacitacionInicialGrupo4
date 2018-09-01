package dto;

import model.Restaurant;

public class RestaurantTransferAtDTO {
	
	public static RestaurantDTO transferAtDTO(Restaurant r) {
		return new RestaurantDTO(r.getIdRestaurant(),r.getName(),r.getEmail(),r.getPhone(),r.getAddress());
	}
	public static Restaurant transferAtRestaurant(RestaurantDTO r) {
		Restaurant resto= new Restaurant();
		resto.setIdRestaurant(r.getId());
		resto.setAddress(r.getAddress());
		resto.setEmail(r.getEmail());
		resto.setName(r.getName());
		resto.setPhone(r.getPhone());
		resto.setCategory("5 Estrellas");
		return resto;
	}
}
