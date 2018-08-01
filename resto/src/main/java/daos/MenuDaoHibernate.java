package daos;

import org.springframework.stereotype.Repository;

import model.Menu;
@Repository
public class MenuDaoHibernate extends GenericDaoHibernate<Menu> implements MenuDao {

	public MenuDaoHibernate() {
		super(Menu.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long createMenu(Menu m) {
		this.save(m);
		Long aux=(long) 8909;
		return aux;
	}

}
