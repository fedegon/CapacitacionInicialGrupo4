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
	
	/**
	 * Return a List of users with ranking
	 * @param ranking (visit, comensal, gourmet)
	 * @return a List with Users
	 */
	public List<User> getUsersByRanking(String ranking) {
		List<User> aux = new LinkedList<User>();
		for (User user : users) {
			if (user.getRanking().equalsIgnoreCase(ranking)) {
				aux.add(user);
			}
		}
		return aux;
	}
	
	/**
	 * Return a List of restaurants with max comments from startDate to endDate
	 * @param startDate 
	 * @param endDate
	 * @return a List of restaurants
	 */
	public List<Restaurant> getRestaurantsWithMaxComments(Date startDate, Date endDate) {
		List<Restaurant> aux = new LinkedList<Restaurant>();
		List<Comment> auxComments;
		for (Restaurant restaurant : restaurants) {
			auxComments = restaurant.getComments();
			for (Comment comment : auxComments) {
				if (comment.date.after(startDate) && comment.date.before(endDate)) {
					//TODO: faltar completar que hace cuando tiene un comentario
				}
			}
		}
		return aux;
	}
	
}
