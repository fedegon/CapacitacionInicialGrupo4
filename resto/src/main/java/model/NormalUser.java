package model;

import java.util.List;

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
		//agregar a lista de comentarios de platos del usuario?
		//agregar  el comentario a el plato
		//actualizar ranking
	}

	@Override
	public List<User> listFriends() {
		return this.getFriends();
	}
	
	@Override
	public User searchFriend(String aUsername) {
		int index=this.getFriends().indexOf(aUsername);
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
