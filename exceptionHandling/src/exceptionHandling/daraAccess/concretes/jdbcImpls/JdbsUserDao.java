package exceptionHandling.daraAccess.concretes.jdbcImpls;

import java.util.ArrayList;

import exceptionHandling.daraAccess.abstracts.UserDao;
import exceptionHandling.entities.concretes.User;

public class JdbsUserDao implements UserDao{

	private ArrayList<User> users;
	
	public JdbsUserDao() {
		this.users= new ArrayList<User>();
	}
	@Override
	public void register(User user) {
		this.users.add(user);
		
	}

	@Override
	public void update(User updateUser) {
		for (User user : users) {
			if (user.getId() == updateUser.getId()) {
				users.set(users.indexOf(user), updateUser);
			}
		}
	}

	@Override
	public void delete(User user) {
		this.users.remove(user);
		
	}
	@Override
	public ArrayList<User> getAll() {
		
		return this.users;
	}

}