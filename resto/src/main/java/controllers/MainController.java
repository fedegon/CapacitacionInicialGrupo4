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
public class MainController {
	@Autowired 
	PlateService plateService;
	@Autowired
	PlateDao plateDao;
	/*@RequestMapping (value= {"index","/"},produces="text/plain;charset=UTF-8")
	public ModelAndView index() {
		return new ModelAndView("index");
	}*/
	
	@RequestMapping(value= {"index","/","/resto/index"},produces="text/plain;charset=UTF-8")
		public ModelAndView method() {
		System.out.println("holaaaaaaaaaaa");
		plateService.createPlate(new Plate("Pizzas", 120.00, "Bien rico"));
		//plateDao.createPlate(new Plate("Tartas", 120.00, "Bien rico"));
		return new ModelAndView("index");
	}


}
