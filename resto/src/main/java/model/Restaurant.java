package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Restaurant {
	private String name;
	private Location location; //agregue esta var porque cada rest tiene un location 
	private String email;
	private String phone;
	private String category;
	private String address;
	private List<Menu> menuList;
	private Integer idRestaurant;
	
	
	public Restaurant(String r_name) //constructor
	{
	  name=r_name;
	  menuList=new ArrayList<Menu>();
	  Random rand = new Random(); 
	  int value = rand.nextInt(1000); //return random int between 0 y 999
	  idRestaurant=value;
	}
	
	/*public Restaurant(String r_name, String r_email,String r_phone,String r_category,String r_address) //constructor
	{
	  name=r_name;
	  email=r_email;
	  phone=r_phone;
	  category=r_category;
	  address=r_address;
	  menuList=new ArrayList<Menu>();
	  Random rand = new Random(); 
	  int value = rand.nextInt(1000); //return random int between 0 y 999
	  idRestaurant=value;
	}*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Location addLocation(Double lat_rest, Double long_rest){
		Location myLocation=new Location(lat_rest,long_rest);
		this.setLocation(myLocation);
		return myLocation;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location restLocation) {
		this.location = restLocation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List getMenuList() {
		return menuList;
	}

	public void setMenuList(List menuList) {
		this.menuList = menuList;
	}
	
	public void addMenu(Menu menu_rest) {
		menuList.add(menu_rest);
	}
	
	public void addPlateToMenu(Plate plate,Menu menu){
		menu.addPlate(plate);
	}

	public Integer getIdRestaurant() {
		return idRestaurant;
	}

	public void setIdRestaurant(Integer idRestaurant) {
		this.idRestaurant = idRestaurant;
	}

	public List<Comment> getComments() {
		return null;
		// TODO Auto-generated method stub
	}
	

}
