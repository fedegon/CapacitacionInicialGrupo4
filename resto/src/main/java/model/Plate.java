package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="plate")
public class Plate {
	@Id
	@GeneratedValue()
	private long id;
	@Column
	String name;
	@Column
	Double price;
	@Column
	String description;
	@Transient
	List<PlateComment> comments;
	@ManyToOne
    @JoinColumn(name="menu_id", nullable=false)
	private Menu menu;

	 public Plate()//empty constructor
	  {
	    name = "";
	    price = 0.0;
	    description="";
	    comments=new ArrayList<PlateComment>();
	  }
	  public Plate(String plateName, Double platePrice,String descrip,Menu menu) 
	  {
		this.menu=menu;  
	    name = plateName;
	    price = platePrice;
	    description=descrip;
	  }
	  public Plate(String plateName, Double platePrice,String descrip) 
	  {
	    name = plateName;
	    price = platePrice;
	    description=descrip;
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
	
	
	public void addComment(PlateComment p_comment) {
		comments.add(p_comment);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
