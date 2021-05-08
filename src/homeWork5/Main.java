package homeWork5;

import homeWork5.business.abstracts.UserService;
import homeWork5.business.concretes.UserManager;
import homeWork5.dataAccess.concretes.AbcUserDao;
import homeWork5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService1 = new UserManager(new AbcUserDao());
		User user1 = new User(1, "Ahmet", "Ayhan", "ahmetaayhan@gmail.com", "123456");
		userService1.register(user1);
		
		
		
		UserService userService2 = new UserManager(new AbcUserDao());
		User user2 = new User(1, "Mehmet", "Han", "mehmethan@gmail.com", "456789");
		userService2.register(user2);

	}

}
