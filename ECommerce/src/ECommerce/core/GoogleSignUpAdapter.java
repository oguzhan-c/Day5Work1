package ECommerce.core;

import ECommerce.entities.concrates.User;
import ECommerce.googleSignUp.GoogleSignUp;

public class GoogleSignUpAdapter implements ISignUp{

	@Override
	public void SignUp(User user) {
		// TODO Auto-generated method stub
		GoogleSignUp googleSignUp = new GoogleSignUp();
		
		googleSignUp.GoogleAdapter(user.getEposta());
	}

}
