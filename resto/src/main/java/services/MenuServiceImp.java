package services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.MenuDao;
import model.Menu;
@Service
@Transactional
public class MenuServiceImp implements MenuService {

	@Autowired
	private MenuDao menuDao;
	
	@Override
	public long createMenu(Menu m) {
		return menuDao.createMenu(m);
	}

}
