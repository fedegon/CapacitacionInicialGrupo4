package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {
	private Integer idMenu;
	private List<Plate> plateList;
	private Double price;
	private String name;

	public Menu() 
	  {
	    plateList=new ArrayList<Plate>();//VER SI DEJAMOS ARRAYLIST U OTRO TIPO DE ESTRUCTURA
	    price=0.0;
	    Random rand = new Random(); 
	    int value = rand.nextInt(1000); //return random int between 0 y 999
	    idMenu=value;
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
		return idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
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
