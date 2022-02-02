package exceptionHandling.business.concretes;

import java.util.ArrayList;

import exceptionHandling.business.abstracts.UserService;
import exceptionHandling.business.exceptions.BusinessException;
import exceptionHandling.daraAccess.abstracts.UserDao;
import exceptionHandling.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register(User user) throws BusinessException {

		if (checkIfEmpty(user) && checkIfPasswordLength(user.getPassword()) && checkIfIsEmail(user.getEmail())
				&& checkIfIsName(user.getFirstName()) && checkIfIsName(user.getLastName())) {
			this.userDao.register(user);

			System.out.println("Kay�t ba�ar�l� : " + user.getEmail());
		}

	}

	@Override
	public void update(User user) throws BusinessException {

		if (checkIfEmpty(user) && checkIfPasswordLength(user.getPassword()) && checkIfIsEmail(user.getEmail())
				&& checkIfIsName(user.getFirstName()) && checkIfIsName(user.getLastName())) {
			this.userDao.update(user);

			System.out.println("G�ncelleme ba�ar�l� : " + user.getEmail());
		}


	}

	@Override
	public void delete(User user) {

		this.userDao.delete(user);
		System.out.println("Silme ba�ar�l� : " + user.getEmail());

	}

	private boolean checkIfEmpty(User user) throws BusinessException {
		if ((user.getEmail().isEmpty() && user.getFirstName().isEmpty() && user.getLastName().isEmpty()
				&& user.getPassword().isEmpty()))
			throw new BusinessException("Alanlar bo� ge�ilemez!");
		return true;
	}

	private boolean checkIfPasswordLength(String password) throws BusinessException {
		if (password.length() < 6)
			throw new BusinessException("Parola en az 6 karakterden olu�mal�d�r.");

		return true;
	}

	private boolean checkIfIsEmail(String email) throws BusinessException {
		if (!email.contains("@"))
			throw new BusinessException("E-posta alan� e-posta format�nda olmal�d�r.");
		else if (checkIfEmail(email))
			throw new BusinessException("E-Posta daha �nce kullan�lmam�� olmal�d�r.");

		return true;
	}

	private boolean checkIfIsName(String name) throws BusinessException {
		if (!(name.length() > 2)) {
			throw new BusinessException("Ad ve soyad en az iki karakterden olu�mal�d�r.");
		}
		return true;
	}

	private boolean checkIfEmail(String email) {
		var result = this.userDao.getAll();

		for (User user : result) {
			if (email == user.getEmail())
				return true;
		}
		return false;
	}

	@Override
	public void login(User user) {
		var result = this.userDao.getAll();

		for (User loginUser : result) {
			if (loginUser.getEmail() == user.getEmail() && loginUser.getPassword() == user.getPassword()) {
				System.out.println("Giri� Ba�ar�l�");
				return;
			}
		}
		System.out.println("Giri� Ba�ar�s�z!");

	}

	@Override
	public ArrayList<User> getAll() {
		
		return this.userDao.getAll();
	}

}