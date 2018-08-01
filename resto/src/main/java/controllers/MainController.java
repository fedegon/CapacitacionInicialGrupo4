package controllers;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import daos.HibernateUtil;
import daos.PlateDao;
import daos.PlateDaoHibernate;
import model.Menu;
import model.Plate;
import services.MenuService;
import services.PlateService;

@Controller
public class MainController {
	@Autowired 
	PlateService plateService;
	@Autowired
	MenuService menuService;
	@Autowired
	HibernateUtil hibernateUtil;
	/*@RequestMapping (value= {"index","/"},produces="text/plain;charset=UTF-8")
	public ModelAndView index() {
		return new ModelAndView("index");
	}*/
	
	@RequestMapping(value= {"index","/","/resto/index"},produces="text/plain;charset=UTF-8")
		public ModelAndView method() {
		System.out.println("holaaaaaaaaaaa");
		Menu menu=new Menu();
		List<Plate> listPlate=new ArrayList<>();
		listPlate.add(new Plate("Pizzas", 120.00, "Bien rico",menu));
		listPlate.add(new Plate("Bife", 60.00, "Bien criollo",menu));
		listPlate.add(new Plate("Tartas", 80.00, "Bien rico",menu));
		menu.setPlateList(listPlate);
		hibernateUtil.create(menu);
		//menuService.createMenu(menu);
		
		//plateService.createPlate(new Plate("Pizzas", 120.00, "Bien rico"));
		
		return new ModelAndView("index");
	}


}
