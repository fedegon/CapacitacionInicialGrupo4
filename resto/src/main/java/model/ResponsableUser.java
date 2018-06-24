package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ResponsableUser extends User {
	
	private List<Restaurant> myRestaurants;
	
	 public ResponsableUser(String usname, String pass)//empty constructor
	  {
	   super(usname,pass);
	   myRestaurants=new ArrayList<Restaurant>();
	  }

	
	public void addRestaurant(Restaurant restaurant) {
		myRestaurants.add(restaurant);
	}
	
	public void removeRestaurant() {}
	
	public List listMyRestaurant() {
		//list the restaurants added by the users
		return null;}
	
	//public void setTypeComment() {}
	
	@Override
	public String getRanking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComment(String aComment) {
		// TODO Auto-generated method stub

	}

	@Override
	public List listFriends() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchFriend(String aUsername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recommendRestaurant(User aUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void voteRestaurant() {
		// TODO Auto-generated method stub

	}

	@Override
	public void voteMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void votePlate() {
		// TODO Auto-generated method stub

	}

}
