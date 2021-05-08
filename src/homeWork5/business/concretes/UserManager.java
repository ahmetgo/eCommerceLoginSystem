package homeWork5.business.concretes;

import java.util.regex.Pattern;

import homeWork5.business.abstracts.UserService;
import homeWork5.dataAccess.abstracts.UserDao;
import homeWork5.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	public UserManager (UserDao userDao) {
		this.userDao=userDao;
	}

	@Override
	public void register(User user) {
		if (!validateEmail(user)) {
			System.out.println("E-posta alani e-posta formatinda olmalidir. ");
			return;
		} else if ((user.getName().length() < 3) || (user.getLastName().length() < 3)) {
			System.out.println("Ad ve soyad en az iki karakterden olusmalidir. ");
			return;

		} else if (!validatePassword(user)) {
			System.out.println("Parola en az 6 karakterden olusmalidir. ");
			return;
		}else {
			System.out.println("Kayit basarili.");
		}		
	}

	@Override
	public void login(User user) {
		for (User users : this.userDao.getAll()) {
			if (!(users == user)) {
				System.out.println("Böyle bir kullanici yok.");
			} else if (isUser(user)) {
				System.out.println("Sisteme basarili bir sekilde giris yapildi.");
			} else {
				System.out.println(" Hesabinizi Eposta adresinizden aktif hale getirebilirsiniz.");
			}
		}
		
	}

	public boolean isUser(User user) {
		for (User users : this.userDao.getAll()) {
			if (users==user) {
					return true;
			}			
		}
		return false;
	}

	@Override
	public void update(User user) {

		
	}

	@Override
	public void delete(User user) {
		
		
	}

	@Override
	public boolean validateEmail(User user) {
		String emailRegex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
		return Pattern.matches(emailRegex, user.getemail());

	}

	@Override
	public boolean validatePassword(User user) {
		String passwordRegex = ".{6,}";
		return Pattern.matches(passwordRegex, user.getPassword());
	}

}
