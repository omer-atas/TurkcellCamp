package exceptionHandling;

import exceptionHandling.business.concretes.UserManager;

import exceptionHandling.business.exceptions.BusinessException;
import exceptionHandling.dataAccess.concretes.hibernateImpls.HibernateUserDao;
import exceptionHandling.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new HibernateUserDao());

		User user1 = new User(1, "AAA", "AAA", "AA@AA", "AAAAAAA");
		User user2 = new User(2, "BBB", "BBB", "BB@BB", "BBBBBB");
		User user3 = new User(1, "CCC", "CCC", "CC@CC", "CCCCCC");
		

		try {
			userManager.register(user1);
		} catch (BusinessException e) {
			e.printStackTrace();
		}

		
		try {
			userManager.register(user2);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		
		try {
			userManager.update(user3);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		
		userManager.delete(user2);
		
		System.out.println("----------------------");
		
		for (User u : userManager.getAll()) {
			System.out.println(u.getFirstName());
		}
	}

}
