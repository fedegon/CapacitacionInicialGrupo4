package daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.NormalUser;
@Repository
public class NormalUserDaoHibernate implements NormalUserDao {
	
	@Autowired
	private HibernateUtil<NormalUser> hibernateUtil;
	
	@Override
	public void save(NormalUser user) {
		

	}

	@Override
	public List<NormalUser> toList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NormalUser persist(NormalUser entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NormalUser findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(NormalUser entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(NormalUser entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public NormalUser findByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long createUser(NormalUser anUser) {
		System.out.println("entre aca");
		return (long) hibernateUtil.create(anUser);
	}

}
