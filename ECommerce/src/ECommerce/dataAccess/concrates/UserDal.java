package ECommerce.dataAccess.concrates;

import java.util.List;

import ECommerce.dataAccess.abstracts.IUserDal;
import ECommerce.entities.concrates.User;

public class UserDal implements IUserDal {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("User Added :\t" + user.getEposta());
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("User Deleted :\t" + user.getEposta());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("User Updated :\t" + user.getEposta());
	}

	@Override
	public int get(int id) {
		// TODO Auto-generated method stub
		System.out.println("Bringed User Id :\t" + id);
		return 0;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		System.out.println("Bringed Users");
		return null;
	}

}
