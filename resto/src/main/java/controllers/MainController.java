package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.RestaurantDTO;
import export.ExportData;
import export.ExportWithGSON;
import model.NormalUser;
import services.MenuService;
import services.NormalUserService;
import services.PlateService;
import services.RestaurantService;
@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
@Controller
public class MainController {
	@Autowired 
	PlateService plateService;
	@Autowired
	MenuService menuService;
	@Autowired
	RestaurantService restoService;
	@Autowired
	NormalUserService normaUserService;
	/*@RequestMapping (value= {"index","/"},produces="text/plain;charset=UTF-8")
	public ModelAndView index() {
		return new ModelAndView("index");
	}*/
	
	@RequestMapping(value= {"index","/","/resto/index"},produces="text/plain;charset=UTF-8")
		public ModelAndView method() {
		System.out.println("holaaaaaaaaaaa");
		NormalUser user= new NormalUser("Ale2", "123456");
		ExportWithGSON<NormalUser> export=new ExportWithGSON<NormalUser>();
		System.out.println(export.exportObject(user));
		//hibernateUtil.create(user);
		/*normaUserService.createUser(user);*/
		/*Menu menu=new Menu();
		menu.setName("EL Mortal");
		Restaurant resto=new Restaurant("El resto", "ejemplo@ejemplo", "222222", "5 estrellas", "120 y 50");
		menu.setRestaurant(resto);
		resto.addMenu(menu);
		restoService.createRestaurant(resto);*/
		
		/*List<Plate> listPlate=new ArrayList<>();
		listPlate.add(new Plate("Pizzas", 120.00, "Bien rico",menu));
		listPlate.add(new Plate("Bife", 60.00, "Bien criollo",menu));
		listPlate.add(new Plate("Tartas", 80.00, "Bien rico",menu));
		ExportJSON<List<Plate>> export2=new ExportJSON<>();
		System.out.println(export2.exportObject(listPlate));*/
		/*menu.setPlateList(listPlate);
		menuService.createMenu(menu);
		
		plateService.createPlate(new Plate("PizzasSolo", 120.00, "Bien rico",menu));*/
		//Restaurant resto2=restoService.getRestaurantByID(23);
		//System.out.println(resto2.getName());/*
		//restoService.deleteRestaurant(resto);*/
		
		return new ModelAndView("index");
	}
	@RequestMapping(value = "/getString", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<String> testJSON() {
		ExportData export=new ExportWithGSON<ArrayList<RestaurantDTO>>();
		System.out.println("test");
		return export.exportObjectToHttp(restoService.getFirstTenRestaurant());
	}

	@RequestMapping(value = "/getJSON", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<String> testJSON2() {
		System.out.println("holaaaaaaaaaaa JSON");
		RestaurantDTO resto=restoService.getRestaurantByID(25);
		ExportData export=new ExportWithGSON<RestaurantDTO>();
		return export.exportObjectToHttp(resto);
	}

}
