package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	@Id
	@GeneratedValue()
	private Integer id;
	@OneToMany(mappedBy="menu", cascade= CascadeType.ALL)
	private List<Plate> plateList;
	@Column
	private Double price;
	@Column
	private String name;

	public Menu() 
	  {
	    plateList=new ArrayList<Plate>();//VER SI DEJAMOS ARRAYLIST U OTRO TIPO DE ESTRUCTURA
	    price=0.0;
	    Random rand = new Random(); 
	    int value = rand.nextInt(1000); //return random int between 0 y 999
	    id=value;
	  }
	
	public List getPlateList() {
		return plateList;
	}

	public void setPlateList(List plateList) {
		this.plateList = plateList;
	}
	
	public void addPlate (Plate plate) {
		plateList.add(plate);
	}

	public Integer getIdMenu() {
		return id;
	}

	public void setIdMenu(Integer idMenu) {
		this.id = idMenu;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
