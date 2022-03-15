package ECommerce.dataAccess.abstracts;

import java.util.List;

import ECommerce.entities.concrates.User;

public interface IUserDal {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getAll();
}
