package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NormalUserTest {
	
	User userTest;
	
	@BeforeEach
	void createUser() {
		userTest=new NormalUser("User_Test_1","test1");
		
		this.userTest.addFriend(new NormalUser("friend_1", "f1"));
		this.userTest.addFriend(new NormalUser("friend_2", "f2"));
		this.userTest.addFriend(new NormalUser("friend_3", "f3"));
	}
	
	@Test
	@DisplayName("when recommend restaurant a one friend")
	void testRecommendRestaurant() {
		NormalUser friend=new NormalUser("User_friend","friend");
		this.userTest.addFriend(friend);
		Restaurant resto=new Restaurant("resto_test");
		this.userTest.recommendRestaurant(friend, "descripcion test", resto);
		assertTrue(friend.getRecommendatios().size()==1);
	}
	
	@Test
	@DisplayName("whe recommend a restaurant a all friends")
	void testRecommendRestaurantAllFriends() {
		
		Restaurant resto=new Restaurant("resto_test");
		
		this.userTest.recommendRestaurantAllFriends("test description", resto);
		
		assertTrue(userTest.getFriends().get(0).getRecommendatios().size()==1);
		assertTrue(userTest.getFriends().get(1).getRecommendatios().size()==1);
		assertTrue(userTest.getFriends().get(2).getRecommendatios().size()==1);
	}

	@Test
	@DisplayName("search friend")
	void testSearchFriend(){
		NormalUser friendS=new NormalUser("friend_2", "f2");
		assertTrue(this.userTest.searchFriend(friendS) != null);
	}
}
