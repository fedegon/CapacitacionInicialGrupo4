package model;

import java.util.Date;

public class Recommendation {
	private Restaurant restaurant;
	private Plate plate;
	private Menu menu;
	private String description;
	private User friend;
	private Date dateRecomendation;
	
	public Recommendation(User anUser, String aDescription, Restaurant aRestaurant) {
		this.restaurant=aRestaurant;
		this.friend=anUser;
		this.description=aDescription;
		this.dateRecomendation=new Date();
	}
	
	public Recommendation(User anUser, String aDescription, Plate aPlate) {
		this.plate=aPlate;
		this.friend=anUser;
		this.description=aDescription;
		this.dateRecomendation=new Date();
	}
	
	public Recommendation(User anUser, String aDescription, Menu aMenu) {
		this.menu=aMenu;
		this.friend=anUser;
		this.description=aDescription;
		this.dateRecomendation=new Date();
	}
	
	public Date getDateRecomendation() {
		return dateRecomendation;
	}
	public void setDateRecomendation(Date dateRecomendation) {
		this.dateRecomendation = dateRecomendation;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Plate getPlate() {
		return plate;
	}
	public void setPlate(Plate plate) {
		this.plate = plate;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getFriend() {
		return friend;
	}
	public void setFriend(User friend) {
		this.friend = friend;
	}
	
	
}
