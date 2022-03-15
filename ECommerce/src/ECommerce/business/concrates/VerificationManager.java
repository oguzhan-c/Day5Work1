package ECommerce.business.concrates;

import ECommerce.business.abstracts.IVerificationService;

public class VerificationManager implements IVerificationService {

	@Override
	public boolean verify() {
		// TODO Auto-generated method stub
		return true;
		//Email Doğrulandı
	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub
		System.out.println("Email Sended");
	}

}
