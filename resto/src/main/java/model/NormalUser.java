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
