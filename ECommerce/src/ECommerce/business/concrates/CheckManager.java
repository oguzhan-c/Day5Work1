package ECommerce.business.concrates;

import java.util.List; 
import java.util.regex.Pattern;

import ECommerce.business.abstracts.ICheckService;
import ECommerce.dataAccess.abstracts.IUserDal;
import ECommerce.dataAccess.concrates.UserDal;
import ECommerce.entities.concrates.User;

public class CheckManager implements ICheckService
{

	IUserDal userDal = new UserDal();
	List<User> emails = userDal.getAll();
	
	@Override
	public boolean checkIfPasswordCharacterRange(User user) {
		// TODO Auto-generated method stub
		if (user.getParola().length() < 6) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkIfEmailFormat(User user) {
		// TODO Auto-generated method stub
		 String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	     Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	     
	     if(!pattern.matcher(user.getEposta()).find()) {
	    	 return false;
	    	 // Email Formatı uygun değil
	     }
	     return true;
	}

	@Override
	public boolean checkIfEmailAlreadyExist(User user) {
		// TODO Auto-generated method stub
		for (User item : emails) {
			if(item.getEposta() == user.getEposta()) {
				return false;
				// Email önceden kullanılmış.
			}
		}
		
		return true;
	}

	@Override
	public boolean checkIfNameCharacterRange(User user) {
		// TODO Auto-generated method stub
		if (user.getAd().length() < 2 || user.getSoyad().length() < 2 ) {
			return false;
			// kullanıcı adı veya soyadı 2 karakterden az yazılmış
		}
		
		return true;
	}

	@Override
	public boolean checkIfPasswordValid(String password) {
		// TODO Auto-generated method stub
		if(password.length() <= 0)
			return false;
		return true;
	}

}
