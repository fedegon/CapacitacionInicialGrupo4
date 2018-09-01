package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import dto.RestaurantDTO;
import dto.RestaurantTransferAtDTO;
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

	@RequestMapping(value = "/restaurant/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<String> testJSON2(@PathVariable("id") long id) {
		System.out.println("holaaaaaaaaaaa JSON");
		RestaurantDTO resto=restoService.getRestaurantByID(id);
		ExportData export=new ExportWithGSON<RestaurantDTO>();
		return export.exportObjectToHttp(resto);
	}
	
	@RequestMapping(value="/createResto", headers="Accept=*/*", method = RequestMethod.POST, produces="application/json;")
	public @ResponseBody ResponseEntity<String> sendInfo(@RequestBody String object){
		System.out.println("entre controlador");
		RestaurantDTO rDTO = new Gson().fromJson(object, RestaurantDTO.class);
		restoService.createRestaurant(RestaurantTransferAtDTO.transferAtRestaurant(rDTO));
		return new ResponseEntity<String>("",HttpStatus.OK);
	}
	@RequestMapping(value="/updateResto", headers="Accept=*/*", method = RequestMethod.POST, produces="application/json;")
	public @ResponseBody ResponseEntity<String> sendInfoEdit(@RequestBody String object){
		System.out.println("entre controlador edit");
		RestaurantDTO rDTO = new Gson().fromJson(object, RestaurantDTO.class);
		System.out.println(rDTO.getId());
		restoService.updateRestaurant(RestaurantTransferAtDTO.transferAtRestaurant(rDTO));
		return new ResponseEntity<String>("",HttpStatus.OK);
	}
	@RequestMapping(value="/deleteResto", headers="Accept=*/*", method = RequestMethod.POST, produces="application/json;")
	public @ResponseBody ResponseEntity<String> sendInfoDelete(@RequestBody String object){
		System.out.println("entre controlador delete");
		RestaurantDTO rDTO = new Gson().fromJson(object, RestaurantDTO.class);
		System.out.println(rDTO.getId());
		restoService.deleteRestaurant(RestaurantTransferAtDTO.transferAtRestaurant(rDTO));
		return new ResponseEntity<String>("test mensaje",HttpStatus.OK);
	}
}
