package ECommerce.business.abstracts;

import ECommerce.entities.concrates.User;

public interface ICheckService {
	
	boolean checkIfPasswordCharacterRange(User user);
	boolean checkIfEmailFormat(User user);
	boolean checkIfEmailAlreadyExist(User user);
	boolean checkIfNameCharacterRange(User user);
	boolean checkIfPasswordValid(String password);
	
}
