package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.*;

@Entity
@Table(name="restaurant")
public class Restaurant {

	@Column
	private String name;
	@Transient
	private Location location; //agregue esta var porque cada rest tiene un location 
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private String category;
	@Column
	private String address;
	@OneToMany(mappedBy="restaurant", cascade= CascadeType.ALL)
	private List<Menu> menuList;
	@Id
	@GeneratedValue()
	private long idRestaurant;
	
	public Restaurant(String name, String email, String phone, String category, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.category = category;
		this.address = address;
		this.menuList=new ArrayList<Menu>();
	}

	
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

	public long getIdRestaurant() {
		return idRestaurant;
	}

	public void setIdRestaurant(long idRestaurant) {
		this.idRestaurant = idRestaurant;
	}
	

}
