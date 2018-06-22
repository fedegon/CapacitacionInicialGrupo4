package model;

import java.util.List;

public class AdminUser {
	private String username;
	private String password;
	
	public boolean deleteUser(User aUser) {return false;}
	
	public boolean banUser(User aUser) {return false;}
	
	public List listUser() {return null;}
	
	public User searchUser(User aUser) {return null;}
	
	public boolean banRestaurant() {return false;}
	
	public void broadCastMessage(String aMessage) {}
	
	public boolean sendMessageToUser(User aUser,String aMessage) {
		this.toString();
		return false;}
}
