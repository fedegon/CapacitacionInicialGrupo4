package model;

import java.util.List;

public abstract class User {
	private String username;
	private String name;
	private String lastname;
	private String password;
	private String description;
	private String photo;
	
	public User (String usname,String pass){
		username=usname;
		password=pass;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	/*The collections of votes are missing, 
	which will be added when the classes are constructed.*/
	
	public abstract String getRanking();
	public abstract void addComment(String aComment);
	/*public abstract List listRecommendations();*/
	public abstract List listFriends();
	public abstract User searchFriend(String aUsername);
	public abstract void recommendRestaurant(User aUser);
	public abstract void voteRestaurant();
	public abstract void voteMenu();
	public abstract void votePlate();
}
