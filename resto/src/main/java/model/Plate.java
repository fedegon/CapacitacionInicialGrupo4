package model;

import java.util.Random;

public class Plate {
	String name;
	Double price;
	Integer idPlate;

	 public Plate()//empty constructor
	  {
	    name = "";
	    price = 0.0;
	    Random rand = new Random(); 
	    int value = rand.nextInt(1000); //return random int between 0 y 999
	    idPlate=value;
	  }

	  public Plate(String plateName, Double platePrice) 
	  {
	    name = plateName;
	    price = platePrice;
	    Random rand = new Random(); 
	    int value = rand.nextInt(1000); //return random int between 0 y 999
	    idPlate=value;
	  }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getIdPlate() {
		return idPlate;
	}
	public void setIdPlate(Integer idPlate) {
		this.idPlate = idPlate;
	}
}
