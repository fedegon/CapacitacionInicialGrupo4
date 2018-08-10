package services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.NormalUserDao;
import daos.NormalUserDaoHibernate;
import model.NormalUser;
@Service
@Transactional
public class NormalUserServiceImp implements NormalUserService {

	@Autowired
	private NormalUserDao userDao;
	
	@Override
	public long createUser(NormalUser anUser) {
		// TODO Auto-generated method stub
		System.out.println("entre aca servicio");
		return userDao.createUser(anUser);
		
	}

}
