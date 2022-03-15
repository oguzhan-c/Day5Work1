package ECommerce.business.concrates;

import java.util.List;

import ECommerce.business.abstracts.ICheckService;
import ECommerce.business.abstracts.IUserService;
import ECommerce.business.abstracts.IVerificationService;
import ECommerce.core.ISignUp;
import ECommerce.dataAccess.abstracts.IUserDal;
import ECommerce.entities.concrates.User;

public class UserManager implements IUserService{

	private ICheckService checkService;
	private IVerificationService verificationService;
	private IUserDal userDal;
	private ISignUp signUp;

	public UserManager(ISignUp signUp , ICheckService checkService, IVerificationService verificationService, IUserDal userDal) {
		this.checkService = checkService;
		this.verificationService = verificationService;
		this.userDal = userDal;
		this.signUp = signUp;
	}
		
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		
			if(
				!(	checkService.checkIfEmailAlreadyExist(user ) &&
					checkService.checkIfEmailFormat(user) &&
					checkService.checkIfNameCharacterRange(user) &&
					checkService.checkIfPasswordCharacterRange(user))
				) {

				System.out.println("Signup unsuccesful");	
			}
			else {

				if (user.getEposta().contentEquals("gmail.com")) {
					signUp.SignUp(user);
					userDal.add(user);
					verificationService.sendEmail();


				}

				userDal.add(user);
				verificationService.sendEmail();
				System.out.println("Signup is succesful");
				
			}
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		if (checkService.checkIfPasswordValid(user.getParola()) && checkService.checkIfEmailAlreadyExist(user) ) {
			System.out.println("Login Succesed.");
		
		}
		else {
			System.out.println("Login UnSuccesed.");

		}

	}
	
}
