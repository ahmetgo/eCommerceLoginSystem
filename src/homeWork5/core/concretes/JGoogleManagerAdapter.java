package homeWork5.core.concretes;

import homeWork5.core.abstracts.GoogleService;
import homeWork5.entities.concretes.User;

public class JGoogleManagerAdapter implements GoogleService{

	public void addGoogleUser(User user) {
		System.out.println("Sisteme Google ile giriþ yapildi.");
		
	}

}