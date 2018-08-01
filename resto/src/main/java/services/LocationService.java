package services;

import model.Location;
import model.Plate;

public interface  LocationService {

	public Long createLocation(Location p);
	public Location mergeLocation(Location p);
}
