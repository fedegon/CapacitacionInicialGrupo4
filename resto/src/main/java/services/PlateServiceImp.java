package services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.PlateDao;
import model.Plate;
//CREO QUE FALTABA AGREGAR ESTO
@Service
@Transactional
public class PlateServiceImp implements PlateService {
	
	@Autowired
	private PlateDao plateDao;

	public PlateServiceImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Long createPlate(Plate p){
		return plateDao.createPlate(p);
	}
	
	public Plate mergePlate(Plate p) {
		return plateDao.mergePlate(p);
	}


}
