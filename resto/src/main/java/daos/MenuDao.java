package daos;

import model.Menu;

public interface MenuDao extends GenericDao<Menu>{
	public long createMenu(Menu m);
}
