package model;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
	private String username;
	private String name;
	private String lastname;
	private String password;
	private String description;
	private String photo;
	private List<User> friends;
	private List<Recommendation> recommendatios;
	private List<PlateComment> plateComment;
	
	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	public User() {
		friends=new ArrayList<User>();
	}

	public User (String usname,String pass){
		username=usname;
		password=pass;
		friends=new ArrayList<User>() ;
		recommendatios=new ArrayList<Recommendation>();
		plateComment=new ArrayList<PlateComment>();
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
	
	public void addFriend(User anUser) {
		this.getFriends().add(anUser);
	}
	public void removeFriend(User anUser) {
		this.getFriends().remove(anUser);
	}
	
	
	/*The collections of votes are missing, 
	which will be added when the classes are constructed.*/
	
	public abstract String getRanking();
	public abstract void addComment(String aComment);
	public abstract void addComment(String aComment,Plate aPlate);
	/*public abstract List listRecommendations();*/
	public abstract List<User> listFriends();
	public abstract User searchFriend(User aUser);
	public abstract void recommendRestaurant(User aUser,String aDescription, Restaurant aRestaurant);
	public abstract void voteRestaurant();
	public abstract void voteMenu();
	public abstract void votePlate();
	public abstract void recommendRestaurantAllFriends(String aDescription, Restaurant aRestaurant);

	public List<Recommendation> getRecommendatios() {
		return recommendatios;
	}

	public void setRecommendatios(List<Recommendation> recommendatios) {
		this.recommendatios = recommendatios;
	}
	
	public void addRecommendation(Recommendation aRecommendation) {
		this.getRecommendatios().add(aRecommendation);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		//for now, this is so
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	public List<PlateComment> getPlateComment() {
		return plateComment;
	}

	public void setPlateComment(List<PlateComment> plateComment) {
		this.plateComment = plateComment;
	}
}
