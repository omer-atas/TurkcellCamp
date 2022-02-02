package exceptionHandling.daraAccess.abstracts;

import java.util.ArrayList;

import exceptionHandling.entities.concretes.User;

public interface UserDao {

	void register(User user);

	void update(User user);

	void delete(User user);

	ArrayList<User> getAll();

}
