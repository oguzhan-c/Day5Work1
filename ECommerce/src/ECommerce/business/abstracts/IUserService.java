package ECommerce.business.abstracts;

import ECommerce.entities.concrates.User;

public interface IUserService {
	void register(User user);
	void login(User user);
}
