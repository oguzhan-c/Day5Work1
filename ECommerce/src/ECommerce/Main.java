package ECommerce;

import ECommerce.business.concrates.CheckManager;
import ECommerce.business.concrates.UserManager;
import ECommerce.business.concrates.VerificationManager;
import ECommerce.core.GoogleSignUpAdapter;
import ECommerce.dataAccess.concrates.UserDal;
import ECommerce.entities.concrates.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		User user = new User(1, "can", "oguzhan.can.iletisim@gmail.com", "224222242", "Oğuzhan");
		
		UserManager userManager = new UserManager(new GoogleSignUpAdapter() , new CheckManager(), new VerificationManager(),new UserDal());
		
		userManager.register(user);
		userManager.login(user);
	}

}
