package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="normaluser")
public class NormalUser extends User {

	public NormalUser(String usname, String pass) {
        super(usname, pass);
        //do whatever you want to do in your constructor here
    }
	
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
	public void addComment(String aComment,Plate aPlate) {
		PlateComment p_comment= new PlateComment();
		p_comment.setComment(aComment);
		getPlateComment().add(p_comment);
		aPlate.addComment(p_comment);
	}

	@Override
	public List<User> listFriends() {
		return this.getFriends();
	}
	
	@Override
	public User searchFriend(User aUser) {
		int index=this.getFriends().indexOf(aUser);
		if(index>0) {
			return this.getFriends().get(index);
		}else
			return null;
	}

	@Override
	public void recommendRestaurant(User aUser,String aDescription, Restaurant aRestaurant) {
		Recommendation recommendation=new Recommendation(this,aDescription, aRestaurant);
		aUser.addRecommendation(recommendation);
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

	@Override
	public void recommendRestaurantAllFriends(String aDescription,Restaurant aRestaurant) {
		Recommendation recommendation=new Recommendation(this,aDescription, aRestaurant);
		for (User friend : this.getFriends()) {
			friend.addRecommendation(recommendation);
		}
	}

}
