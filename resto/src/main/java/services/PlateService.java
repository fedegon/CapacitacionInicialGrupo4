package services;

import org.springframework.beans.factory.annotation.Autowired;

import model.Plate;
//CHEQUEAR SI ESTA BIEN
public interface PlateService {
	
	
	public Long createPlate(Plate p);
	public Plate mergePlate(Plate p);

}
