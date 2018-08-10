package daos;

import model.NormalUser;

public interface NormalUserDao extends GenericDao<NormalUser> {
	public long createUser(NormalUser anUser);
}
