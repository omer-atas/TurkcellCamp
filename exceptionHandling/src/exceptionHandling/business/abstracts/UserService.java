package exceptionHandling.business.abstracts;



import java.util.ArrayList;

import exceptionHandling.business.exceptions.BusinessException;
import exceptionHandling.entities.concretes.User;

public interface UserService {
	
	void register(User user) throws BusinessException;

	void login(User user) throws BusinessException;

	void update(User user) throws BusinessException;

	void delete(User user) throws BusinessException;
	
	ArrayList<User> getAll();
}
