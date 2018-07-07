package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Ratatouille {
	private static Ratatouille instance = null;
	private List<User> users;
	private List<Restaurant> restaurants;
	
	private Ratatouille() {
		users = new LinkedList<User>();
		restaurants = new LinkedList<Restaurant>();
	}

	public static Ratatouille getInstance() {
		if (instance == null) {
			instance = new Ratatouille();
		}
		return instance;
	}
	
	/**
	 * Find a User with username = name
	 * @param username to search
	 * @return an User if match, null if not found
	 */
	public User getUser(String username){
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
	
	/**
	 * Find a Restaurant with name = name
	 * @param name to search
	 * @return an Restaurant if match, null if not found
	 */
	public Restaurant getRestaurant(String name){
		for (Restaurant restaurant : restaurants) {
			if (restaurant.getName().equals(name)) {
				return restaurant;
			}
		}
		return null;
	}
	
	/**
	 * Return a List of users with max score
	 * @return a List with Users
	 */
	public List<User> getUsersMaxScore() {
		List<User> aux = new LinkedList<User>();
		// TODO Falta Listar los usuarios que tienen mejor score.
		return aux;
	}
	
	public List<User> getUsersByRanking(String ranking) {
		List<User> aux = new LinkedList<User>();
		// TODO Listar la cantidad total de usuarios visitantes / comensales / gourmets (ranking)
		return aux;
	}
	
	public List<Restaurant> getRestaurantsWithMaxComments(Date startDate, Date endDate) {
		List<Restaurant> aux = new LinkedList<Restaurant>();
		// TODO Listar los restaurants que tuvieron más comentarios en un determinado rango de fechas.
		return aux;
	}
	
}
