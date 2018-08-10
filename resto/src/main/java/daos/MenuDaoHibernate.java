package daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Menu;
@Repository
public class MenuDaoHibernate implements MenuDao {
	
	@Autowired
	private HibernateUtil<Menu> util;
	
	public MenuDaoHibernate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public long createMenu(Menu m) {
		util.create(m);
		Long aux=(long) 8909;
		return aux;
	}

	@Override
	public void save(Menu tipo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Menu> toList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu persist(Menu entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Menu entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Menu entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Menu findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
