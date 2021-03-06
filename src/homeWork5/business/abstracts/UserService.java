package homeWork5.business.abstracts;

import homeWork5.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void update(User user);
	void delete(User user);
	boolean validateEmail(User user);
	boolean validatePassword(User user);
	boolean isUser(User user);
}
