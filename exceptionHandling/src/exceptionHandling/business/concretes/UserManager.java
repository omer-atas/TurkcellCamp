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

			System.out.println("Kayýt baþarýlý : " + user.getEmail());
		}

	}

	@Override
	public void update(User user) throws BusinessException {

		if (checkIfEmpty(user) && checkIfPasswordLength(user.getPassword()) && checkIfIsEmail(user.getEmail())
				&& checkIfIsName(user.getFirstName()) && checkIfIsName(user.getLastName())) {
			this.userDao.update(user);

			System.out.println("Güncelleme baþarýlý : " + user.getEmail());
		}


	}

	@Override
	public void delete(User user) {

		this.userDao.delete(user);
		System.out.println("Silme baþarýlý : " + user.getEmail());

	}

	private boolean checkIfEmpty(User user) throws BusinessException {
		if ((user.getEmail().isEmpty() && user.getFirstName().isEmpty() && user.getLastName().isEmpty()
				&& user.getPassword().isEmpty()))
			throw new BusinessException("Alanlar boþ geçilemez!");
		return true;
	}

	private boolean checkIfPasswordLength(String password) throws BusinessException {
		if (password.length() < 6)
			throw new BusinessException("Parola en az 6 karakterden oluþmalýdýr.");

		return true;
	}

	private boolean checkIfIsEmail(String email) throws BusinessException {
		if (!email.contains("@"))
			throw new BusinessException("E-posta alaný e-posta formatýnda olmalýdýr.");
		else if (checkIfEmail(email))
			throw new BusinessException("E-Posta daha önce kullanýlmamýþ olmalýdýr.");

		return true;
	}

	private boolean checkIfIsName(String name) throws BusinessException {
		if (!(name.length() > 2)) {
			throw new BusinessException("Ad ve soyad en az iki karakterden oluþmalýdýr.");
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
				System.out.println("Giriþ Baþarýlý");
				return;
			}
		}
		System.out.println("Giriþ Baþarýsýz!");

	}

	@Override
	public ArrayList<User> getAll() {
		
		return this.userDao.getAll();
	}

}