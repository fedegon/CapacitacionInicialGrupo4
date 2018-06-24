package model;

import java.util.Random;

public class Location {
Double latitude;
Double longitude;
Integer idLocation;


public Location(Double lati, Double longi) 
{
  latitude=lati;
  longitude=longi;
  Random rand = new Random(); 
  int value = rand.nextInt(1000); //return random int between 0 y 999
  idLocation=value;
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
public Integer getIdLocation() {
	return idLocation;
}
public void setIdLocation(Integer idLocation) {
	this.idLocation = idLocation;
}

}
