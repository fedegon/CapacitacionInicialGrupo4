package controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import daos.PlateDao;
import daos.PlateDaoHibernate;

import model.Plate;
import services.PlateService;

@Controller
public class MainControllerTest {
	@Autowired 
	PlateService plateService;
	//SUBO ESTA PRUEBA PORQUE NO QUIERO PISAR EL OTRO
	//EN LOS CONTROLLERS TENEMOS QUE LLAMAR A LOS SERVICIOS SIEMPRE
	//Y QUE EL SERVICIO LLAME AL DAO.
	//FIJENSE SI LES FUNCIONA COPIANDO METHOD AL MAINCONTROLLER ORIGINAL 
	//PORQUE A MI ME TIRA ERROR
	//QUE NO ENCUENTRA LA URI /RESTO/INDEX EN MVC-DISPATCHER Y NO TOQUE NADA AHI
	//ASI QUE NO SE QUE PASA.
	
	
	
//	@AUTOWIRED
//	PLATEDAO PLATEDAO;

	
	@RequestMapping (value= {"index","/"},produces="text/plain;charset=UTF-8")
	public ModelAndView method() {
		Plate p=new Plate("POLLO A LAS BRASAS", 500.00, "POLLO ASADO CON ENSALADA VERDE");
		Plate p2=new Plate("Ensalada de Atun", 100.00, "tomate lechuga atun mayonesa");
		Plate p3=new Plate("tallarines al pesto", 1100.00, "tallarines con pesto de espinaca");
		//plateDao.createPlate(p);
		plateService.createPlate(p2);
		plateService.createPlate(p3);
		return new ModelAndView("index");
	}

}
