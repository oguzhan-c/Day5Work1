package ECommerce.dataAccess.concrates;

import java.util.ArrayList;
import java.util.List;

import ECommerce.dataAccess.abstracts.IUserDal;
import ECommerce.entities.concrates.User;

public class UserDal implements IUserDal {
		
	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		System.out.println("User Added :\t" + user.getEposta());
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		users.remove(user.getId());
		System.out.println("User Deleted :\t" + user.getEposta());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("User Updated :\t" + user.getEposta());
	}

	public User get(int id) {
		return users.get(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		System.out.println("Bringed Users");
		return users;
	}

}
