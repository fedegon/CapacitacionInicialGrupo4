package model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location {
	@Id
	@GeneratedValue()
	private long id;
	@Column
	Double latitude;
	@Column
	Double longitude;
	


public Location(Double lati, Double longi) 
{
  latitude=lati;
  longitude=longi;
}


public Double getLatitude() {
	return latitude;
}
public void setLatitude(Double latitude) {
	latitude = latitude;
}
public Double getLongitude() {
	return longitude;
}
public void setLongitude(Double longitude) {
	longitude = longitude;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


}
